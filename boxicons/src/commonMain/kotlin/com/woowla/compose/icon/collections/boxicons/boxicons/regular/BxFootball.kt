package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxFootball: ImageVector
    get() {
        if (_bxFootball != null) {
            return _bxFootball!!
        }
        _bxFootball = Builder(name = "BxFootball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 4.929f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, false, -7.07f, -2.938f)
                arcToRelative(9.943f, 9.943f, 0.0f, false, false, -7.072f, 2.938f)
                curveToRelative(-3.899f, 3.898f, -3.899f, 10.243f, 0.0f, 14.142f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, false, 7.073f, 2.938f)
                arcToRelative(9.936f, 9.936f, 0.0f, false, false, 7.07f, -2.937f)
                curveToRelative(3.899f, -3.898f, 3.899f, -10.243f, -0.001f, -14.143f)
                close()
                moveTo(12.181f, 4.0f)
                horizontalLineToRelative(-0.359f)
                curveToRelative(0.061f, -0.001f, 0.119f, -0.009f, 0.18f, -0.009f)
                reflectiveCurveToRelative(0.118f, 0.008f, 0.179f, 0.009f)
                close()
                moveTo(18.243f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineToRelative(-1.258f, 2.516f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, true, -2.741f, 0.493f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -2.746f, -0.494f)
                lineTo(8.0f, 17.01f)
                lineTo(5.765f, 17.01f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -1.623f, -3.532f)
                lineTo(6.0f, 11.0f)
                lineTo(4.784f, 8.567f)
                arcToRelative(7.936f, 7.936f, 0.0f, false, true, 1.559f, -2.224f)
                arcToRelative(7.994f, 7.994f, 0.0f, false, true, 3.22f, -1.969f)
                lineTo(12.0f, 6.0f)
                lineToRelative(2.438f, -1.625f)
                arcToRelative(8.01f, 8.01f, 0.0f, false, true, 3.22f, 1.968f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, 1.558f, 2.221f)
                lineTo(18.0f, 11.0f)
                lineToRelative(1.858f, 2.478f)
                arcTo(7.952f, 7.952f, 0.0f, false, true, 18.243f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.5f, 11.0f)
                lineToRelative(1.5f, 4.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.5f, -4.0f)
                lineTo(12.0f, 8.5f)
                close()
            }
        }
        .build()
        return _bxFootball!!
    }

private var _bxFootball: ImageVector? = null
