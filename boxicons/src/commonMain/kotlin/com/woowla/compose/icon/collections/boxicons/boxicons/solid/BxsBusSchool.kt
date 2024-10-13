package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBusSchool: ImageVector
    get() {
        if (_bxsBusSchool != null) {
            return _bxsBusSchool!!
        }
        _bxsBusSchool = Builder(name = "BxsBusSchool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.597f)
                lineTo(21.0f, 11.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                lineTo(7.0f, 2.0f)
                curveTo(4.794f, 2.0f, 3.0f, 3.794f, 3.0f, 6.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.597f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, -0.999f, 2.648f)
                lineToRelative(0.004f, 3.758f)
                curveToRelative(0.001f, 0.733f, 0.404f, 1.369f, 0.995f, 1.716f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.274f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, false, 0.421f, -0.313f)
                curveToRelative(0.377f, -0.378f, 0.585f, -0.881f, 0.584f, -1.415f)
                lineToRelative(-0.004f, -3.759f)
                arcTo(3.965f, 3.965f, 0.0f, false, false, 21.0f, 11.597f)
                close()
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(6.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 17.0f)
                close()
                moveTo(11.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.5f, 17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.001f, -3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 17.0f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _bxsBusSchool!!
    }

private var _bxsBusSchool: ImageVector? = null
