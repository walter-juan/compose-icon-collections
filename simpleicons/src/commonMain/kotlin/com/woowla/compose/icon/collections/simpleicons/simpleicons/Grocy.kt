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

public val Simpleicons.Grocy: ImageVector
    get() {
        if (_grocy != null) {
            return _grocy!!
        }
        _grocy = Builder(name = "Grocy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.621f, 0.068f)
                curveTo(7.527f, 0.786f, 3.608f, 4.618f, 2.345f, 10.082f)
                curveToRelative(-0.316f, 1.35f, -0.392f, 3.896f, -0.163f, 5.203f)
                curveToRelative(0.62f, 3.57f, 2.96f, 6.574f, 6.15f, 7.913f)
                curveToRelative(1.36f, 0.577f, 2.1f, 0.73f, 3.842f, 0.784f)
                curveToRelative(1.22f, 0.043f, 1.862f, 0.01f, 2.722f, -0.13f)
                curveToRelative(2.688f, -0.447f, 5.399f, -1.699f, 6.65f, -3.092f)
                lineToRelative(0.403f, -0.447f)
                lineToRelative(-0.054f, -1.872f)
                arcToRelative(481.92f, 481.92f, 0.0f, false, true, -0.12f, -5.344f)
                lineToRelative(-0.065f, -3.473f)
                lineToRelative(-2.907f, 0.087f)
                curveToRelative(-1.589f, 0.033f, -3.722f, 0.098f, -4.746f, 0.142f)
                lineToRelative(-1.85f, 0.065f)
                lineToRelative(-0.087f, 2.319f)
                curveToRelative(-0.055f, 1.284f, -0.076f, 2.34f, -0.055f, 2.362f)
                curveToRelative(0.022f, 0.022f, 0.882f, 0.076f, 1.916f, 0.12f)
                lineToRelative(1.872f, 0.076f)
                verticalLineToRelative(0.294f)
                curveToRelative(0.0f, 0.707f, -0.13f, 0.98f, -0.555f, 1.208f)
                curveToRelative(-0.653f, 0.326f, -1.872f, 0.479f, -2.623f, 0.326f)
                curveToRelative(-2.71f, -0.566f, -3.777f, -4.55f, -1.96f, -7.369f)
                curveTo(11.86f, 7.48f, 13.873f, 6.62f, 16.562f, 6.74f)
                curveToRelative(0.74f, 0.043f, 1.665f, 0.163f, 2.123f, 0.272f)
                curveToRelative(0.446f, 0.12f, 0.838f, 0.174f, 0.87f, 0.12f)
                curveToRelative(0.098f, -0.142f, 0.468f, -5.726f, 0.403f, -5.9f)
                curveToRelative(-0.087f, -0.24f, -1.35f, -0.697f, -2.569f, -0.947f)
                curveToRelative(-1.252f, -0.25f, -3.722f, -0.37f, -4.767f, -0.218f)
                close()
            }
        }
        .build()
        return _grocy!!
    }

private var _grocy: ImageVector? = null
