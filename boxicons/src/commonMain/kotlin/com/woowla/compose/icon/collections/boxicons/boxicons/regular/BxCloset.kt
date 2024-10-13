package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxCloset: ImageVector
    get() {
        if (_bxCloset != null) {
            return _bxCloset!!
        }
        _bxCloset = Builder(name = "BxCloset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.551f)
                verticalLineToRelative(-0.678f)
                arcTo(4.005f, 4.005f, 0.0f, false, false, 16.0f, 6.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveTo(8.0f, 3.794f, 8.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.551f)
                lineToRelative(-8.665f, 7.702f)
                arcTo(1.001f, 1.001f, 0.0f, false, false, 3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, false, 0.664f, -1.748f)
                lineTo(13.0f, 10.551f)
                close()
                moveTo(5.63f, 18.0f)
                lineTo(12.0f, 12.338f)
                lineTo(18.37f, 18.0f)
                horizontalLineTo(5.63f)
                close()
            }
        }
        .build()
        return _bxCloset!!
    }

private var _bxCloset: ImageVector? = null
