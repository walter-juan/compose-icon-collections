package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BadgeAdFill: ImageVector
    get() {
        if (_badgeAdFill != null) {
            return _badgeAdFill!!
        }
        _badgeAdFill = Builder(name = "BadgeAdFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.35f, 8.337f)
                curveToRelative(0.0f, -0.699f, -0.42f, -1.138f, -1.001f, -1.138f)
                curveToRelative(-0.584f, 0.0f, -0.954f, 0.444f, -0.954f, 1.239f)
                verticalLineToRelative(0.453f)
                curveToRelative(0.0f, 0.8f, 0.374f, 1.248f, 0.972f, 1.248f)
                curveToRelative(0.588f, 0.0f, 0.984f, -0.44f, 0.984f, -1.2f)
                close()
                moveTo(5.937f, 8.574f)
                lineTo(5.203f, 6.148f)
                lineTo(5.15f, 6.148f)
                lineToRelative(-0.734f, 2.426f)
                horizontalLineToRelative(1.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(8.209f, 8.32f)
                curveToRelative(0.0f, -1.28f, 0.694f, -2.044f, 1.753f, -2.044f)
                curveToRelative(0.655f, 0.0f, 1.156f, 0.294f, 1.336f, 0.769f)
                horizontalLineToRelative(0.053f)
                verticalLineToRelative(-2.36f)
                horizontalLineToRelative(1.16f)
                lineTo(12.511f, 11.0f)
                horizontalLineToRelative(-1.138f)
                verticalLineToRelative(-0.747f)
                horizontalLineToRelative(-0.057f)
                curveToRelative(-0.145f, 0.474f, -0.69f, 0.804f, -1.367f, 0.804f)
                curveToRelative(-1.055f, 0.0f, -1.74f, -0.764f, -1.74f, -2.043f)
                verticalLineToRelative(-0.695f)
                close()
                moveTo(4.169f, 9.458f)
                lineTo(3.7f, 11.0f)
                lineTo(2.5f, 11.0f)
                lineToRelative(2.013f, -5.999f)
                lineTo(5.9f, 5.001f)
                lineTo(7.905f, 11.0f)
                lineTo(6.644f, 11.0f)
                lineToRelative(-0.47f, -1.542f)
                lineTo(4.17f, 9.458f)
                close()
            }
        }
        .build()
        return _badgeAdFill!!
    }

private var _badgeAdFill: ImageVector? = null
