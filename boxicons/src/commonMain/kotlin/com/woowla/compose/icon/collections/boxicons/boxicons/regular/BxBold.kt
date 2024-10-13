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

public val RegularGroup.BxBold: ImageVector
    get() {
        if (_bxBold != null) {
            return _bxBold!!
        }
        _bxBold = Builder(name = "BxBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.061f, 11.22f)
                arcTo(4.46f, 4.46f, 0.0f, false, false, 18.0f, 8.5f)
                curveTo(18.0f, 6.019f, 15.981f, 4.0f, 13.5f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, -1.439f, -3.28f)
                close()
                moveTo(13.5f, 7.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(14.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveTo(14.827f, 16.0f, 14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bxBold!!
    }

private var _bxBold: ImageVector? = null
