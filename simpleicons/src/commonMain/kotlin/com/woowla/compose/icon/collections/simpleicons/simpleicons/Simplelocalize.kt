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

public val Simpleicons.Simplelocalize: ImageVector
    get() {
        if (_simplelocalize != null) {
            return _simplelocalize!!
        }
        _simplelocalize = Builder(name = "Simplelocalize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.62f, 1.5f)
                quadToRelative(1.63f, 0.0f, 3.017f, 0.834f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 2.175f, 2.197f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.988f, -0.606f)
                quadToRelative(1.5f, 0.0f, 2.55f, 1.06f)
                quadToRelative(1.05f, 1.062f, 1.05f, 2.577f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.225f, 1.327f)
                quadToRelative(1.65f, 0.34f, 2.738f, 1.667f)
                quadTo(24.0f, 11.882f, 24.0f, 13.625f)
                quadToRelative(0.0f, 1.326f, -0.637f, 2.444f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, -1.666f, 1.715f)
                curveToRelative(-1.966f, 1.409f, -6.07f, 3.414f, -11.223f, 4.683f)
                curveToRelative(-1.866f, 0.459f, 3.785f, -3.98f, 0.853f, -3.98f)
                quadToRelative(-0.15f, 0.0f, -0.24f, -0.011f)
                lineTo(5.4f, 18.475f)
                arcToRelative(5.17f, 5.17f, 0.0f, false, true, -2.7f, -0.74f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, true, -1.969f, -1.99f)
                arcTo(5.3f, 5.3f, 0.0f, false, true, 0.0f, 13.02f)
                quadToRelative(0.0f, -1.78f, 1.013f, -3.183f)
                reflectiveQuadTo(3.6f, 7.866f)
                verticalLineToRelative(-0.303f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.806f, -3.032f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.6f, 2.315f)
                arcTo(5.86f, 5.86f, 0.0f, false, true, 9.62f, 1.5f)
            }
        }
        .build()
        return _simplelocalize!!
    }

private var _simplelocalize: ImageVector? = null
