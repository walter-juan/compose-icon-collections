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

public val Simpleicons.Comma: ImageVector
    get() {
        if (_comma != null) {
            return _comma!!
        }
        _comma = Builder(name = "Comma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.727f, 24.0f)
                curveToRelative(0.0f, -0.555f, -0.043f, -1.021f, 0.02f, -1.469f)
                curveToRelative(0.027f, -0.191f, 0.25f, -0.396f, 0.432f, -0.511f)
                curveToRelative(0.887f, -0.563f, 1.851f, -1.013f, 2.677f, -1.659f)
                curveToRelative(2.676f, -2.092f, 4.262f, -4.846f, 4.349f, -8.424f)
                curveToRelative(0.025f, -1.016f, -0.349f, -1.27f, -1.202f, -0.874f)
                curveToRelative(-2.463f, 1.142f, -5.111f, 0.473f, -6.525f, -1.65f)
                curveToRelative(-1.541f, -2.316f, -1.324f, -5.398f, 0.523f, -7.421f)
                curveToRelative(2.359f, -2.583f, 6.241f, -2.661f, 8.917f, -0.193f)
                curveToRelative(1.603f, 1.478f, 2.365f, 3.386f, 2.555f, 5.557f)
                curveToRelative(0.637f, 7.272f, -3.01f, 13.266f, -9.649f, 15.899f)
                curveToRelative(-0.657f, 0.26f, -1.331f, 0.474f, -2.098f, 0.746f)
            }
        }
        .build()
        return _comma!!
    }

private var _comma: ImageVector? = null
