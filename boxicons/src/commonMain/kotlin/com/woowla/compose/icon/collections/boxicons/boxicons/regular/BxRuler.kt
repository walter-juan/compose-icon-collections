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

public val RegularGroup.BxRuler: ImageVector
    get() {
        if (_bxRuler != null) {
            return _bxRuler!!
        }
        _bxRuler = Builder(name = "BxRuler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.875f, 7.0f)
                lineTo(3.125f, 7.0f)
                curveTo(1.953f, 7.0f, 1.0f, 7.897f, 1.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.103f, 0.953f, 2.0f, 2.125f, 2.0f)
                horizontalLineToRelative(17.75f)
                curveTo(22.047f, 17.0f, 23.0f, 16.103f, 23.0f, 15.0f)
                lineTo(23.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.953f, -2.0f, -2.125f, -2.0f)
                close()
                moveTo(20.875f, 15.0f)
                lineTo(3.125f, 15.0f)
                curveToRelative(-0.057f, 0.0f, -0.096f, -0.016f, -0.113f, -0.016f)
                curveToRelative(-0.007f, 0.0f, -0.011f, 0.002f, -0.012f, 0.008f)
                lineToRelative(-0.012f, -5.946f)
                curveToRelative(0.007f, -0.01f, 0.052f, -0.046f, 0.137f, -0.046f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(1.875f)
                curveToRelative(0.079f, 0.001f, 0.122f, 0.028f, 0.125f, 0.008f)
                lineToRelative(0.012f, 5.946f)
                curveToRelative(-0.007f, 0.01f, -0.052f, 0.046f, -0.137f, 0.046f)
                close()
            }
        }
        .build()
        return _bxRuler!!
    }

private var _bxRuler: ImageVector? = null
