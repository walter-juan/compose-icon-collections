package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.362f, 10.11f)
                curveToRelative(0.0f, 0.926f, -0.756f, 1.681f, -1.681f, 1.681f)
                reflectiveCurveTo(0.0f, 11.036f, 0.0f, 10.111f)
                reflectiveCurveTo(0.756f, 8.43f, 1.68f, 8.43f)
                horizontalLineToRelative(1.682f)
                close()
                moveTo(4.208f, 10.11f)
                curveToRelative(0.0f, -0.924f, 0.756f, -1.68f, 1.681f, -1.68f)
                reflectiveCurveToRelative(1.681f, 0.756f, 1.681f, 1.68f)
                verticalLineToRelative(4.21f)
                curveToRelative(0.0f, 0.924f, -0.756f, 1.68f, -1.68f, 1.68f)
                arcToRelative(1.685f, 1.685f, 0.0f, false, true, -1.682f, -1.68f)
                close()
                moveTo(5.89f, 3.362f)
                curveToRelative(-0.926f, 0.0f, -1.682f, -0.756f, -1.682f, -1.681f)
                reflectiveCurveTo(4.964f, 0.0f, 5.89f, 0.0f)
                reflectiveCurveToRelative(1.68f, 0.756f, 1.68f, 1.68f)
                verticalLineToRelative(1.682f)
                close()
                moveTo(5.89f, 4.208f)
                curveToRelative(0.924f, 0.0f, 1.68f, 0.756f, 1.68f, 1.681f)
                reflectiveCurveTo(6.814f, 7.57f, 5.89f, 7.57f)
                lineTo(1.68f, 7.57f)
                curveTo(0.757f, 7.57f, 0.0f, 6.814f, 0.0f, 5.89f)
                curveToRelative(0.0f, -0.926f, 0.756f, -1.682f, 1.68f, -1.682f)
                close()
                moveTo(12.639f, 5.89f)
                curveToRelative(0.0f, -0.926f, 0.755f, -1.682f, 1.68f, -1.682f)
                reflectiveCurveTo(16.0f, 4.964f, 16.0f, 5.889f)
                reflectiveCurveToRelative(-0.756f, 1.681f, -1.68f, 1.681f)
                horizontalLineToRelative(-1.681f)
                close()
                moveTo(11.791f, 5.89f)
                curveToRelative(0.0f, 0.924f, -0.755f, 1.68f, -1.68f, 1.68f)
                arcTo(1.685f, 1.685f, 0.0f, false, true, 8.43f, 5.89f)
                lineTo(8.43f, 1.68f)
                curveTo(8.43f, 0.757f, 9.186f, 0.0f, 10.11f, 0.0f)
                curveToRelative(0.926f, 0.0f, 1.681f, 0.756f, 1.681f, 1.68f)
                close()
                moveTo(10.11f, 12.638f)
                curveToRelative(0.926f, 0.0f, 1.682f, 0.756f, 1.682f, 1.681f)
                reflectiveCurveTo(11.036f, 16.0f, 10.11f, 16.0f)
                reflectiveCurveToRelative(-1.681f, -0.756f, -1.681f, -1.68f)
                verticalLineToRelative(-1.682f)
                horizontalLineToRelative(1.68f)
                close()
                moveTo(10.11f, 11.791f)
                curveToRelative(-0.924f, 0.0f, -1.68f, -0.755f, -1.68f, -1.68f)
                reflectiveCurveToRelative(0.756f, -1.681f, 1.68f, -1.681f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0.924f, 0.0f, 1.68f, 0.756f, 1.68f, 1.68f)
                curveToRelative(0.0f, 0.926f, -0.756f, 1.681f, -1.68f, 1.681f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
