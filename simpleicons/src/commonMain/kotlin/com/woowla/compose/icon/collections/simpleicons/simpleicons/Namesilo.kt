package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Namesilo: ImageVector
    get() {
        if (_namesilo != null) {
            return _namesilo!!
        }
        _namesilo = Builder(name = "Namesilo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.65f, 0.0f)
                arcTo(4.65f, 4.65f, 0.0f, false, false, 0.0f, 4.65f)
                verticalLineToRelative(14.7f)
                arcTo(4.65f, 4.65f, 0.0f, false, false, 4.65f, 24.0f)
                horizontalLineToRelative(14.7f)
                arcTo(4.65f, 4.65f, 0.0f, false, false, 24.0f, 19.35f)
                lineTo(24.0f, 4.65f)
                arcTo(4.65f, 4.65f, 0.0f, false, false, 19.35f, 0.0f)
                close()
                moveTo(11.86f, 4.2f)
                lineTo(16.5f, 7.248f)
                lineTo(16.5f, 8.86f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-0.124f, 0.4f, -2.156f, 0.718f, -4.644f, 0.718f)
                reflectiveCurveTo(7.33f, 9.26f, 7.206f, 8.86f)
                lineTo(7.2f, 8.86f)
                lineTo(7.2f, 7.248f)
                close()
                moveTo(7.2f, 9.384f)
                curveToRelative(0.0f, 0.5f, 2.082f, 0.906f, 4.65f, 0.906f)
                curveToRelative(2.568f, 0.0f, 4.65f, -0.406f, 4.65f, -0.906f)
                verticalLineToRelative(2.587f)
                curveToRelative(0.0f, 0.5f, -2.082f, 0.905f, -4.65f, 0.905f)
                curveToRelative(-2.568f, 0.0f, -4.65f, -0.405f, -4.65f, -0.905f)
                close()
                moveTo(7.2f, 12.684f)
                curveToRelative(0.0f, 0.5f, 2.082f, 0.906f, 4.65f, 0.906f)
                curveToRelative(2.568f, 0.0f, 4.65f, -0.405f, 4.65f, -0.905f)
                verticalLineToRelative(2.586f)
                curveToRelative(0.0f, 0.5f, -2.082f, 0.906f, -4.65f, 0.906f)
                curveToRelative(-2.568f, 0.0f, -4.65f, -0.406f, -4.65f, -0.906f)
                close()
                moveTo(7.2f, 15.985f)
                curveToRelative(0.0f, 0.5f, 2.082f, 0.906f, 4.65f, 0.906f)
                curveToRelative(2.568f, 0.0f, 4.65f, -0.406f, 4.65f, -0.906f)
                verticalLineToRelative(2.587f)
                curveToRelative(0.0f, 0.5f, -2.082f, 0.906f, -4.65f, 0.906f)
                curveToRelative(-2.568f, 0.0f, -4.65f, -0.406f, -4.65f, -0.906f)
                close()
            }
        }
        .build()
        return _namesilo!!
    }

private var _namesilo: ImageVector? = null
