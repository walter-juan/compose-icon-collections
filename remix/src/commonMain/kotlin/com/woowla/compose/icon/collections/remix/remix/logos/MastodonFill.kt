package com.woowla.compose.icon.collections.remix.remix.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.LogosGroup

public val LogosGroup.MastodonFill: ImageVector
    get() {
        if (_mastodonFill != null) {
            return _mastodonFill!!
        }
        _mastodonFill = Builder(name = "MastodonFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.26f, 13.99f)
                curveTo(20.985f, 15.401f, 18.803f, 16.945f, 16.297f, 17.244f)
                curveTo(14.991f, 17.4f, 13.704f, 17.543f, 12.332f, 17.48f)
                curveTo(10.089f, 17.377f, 8.318f, 16.945f, 8.318f, 16.945f)
                curveTo(8.318f, 17.163f, 8.332f, 17.371f, 8.358f, 17.566f)
                curveTo(8.65f, 19.78f, 10.554f, 19.912f, 12.358f, 19.974f)
                curveTo(14.178f, 20.037f, 15.799f, 19.525f, 15.799f, 19.525f)
                lineTo(15.873f, 21.171f)
                curveTo(15.873f, 21.171f, 14.6f, 21.855f, 12.332f, 21.98f)
                curveTo(11.081f, 22.049f, 9.528f, 21.949f, 7.72f, 21.47f)
                curveTo(3.797f, 20.432f, 3.122f, 16.25f, 3.019f, 12.007f)
                curveTo(2.987f, 10.748f, 3.007f, 9.56f, 3.007f, 8.566f)
                curveTo(3.007f, 4.228f, 5.85f, 2.956f, 5.85f, 2.956f)
                curveTo(7.283f, 2.298f, 9.742f, 2.021f, 12.299f, 2.0f)
                horizontalLineTo(12.362f)
                curveTo(14.919f, 2.021f, 17.38f, 2.298f, 18.813f, 2.956f)
                curveTo(18.813f, 2.956f, 21.656f, 4.228f, 21.656f, 8.566f)
                curveTo(21.656f, 8.566f, 21.692f, 11.767f, 21.26f, 13.99f)
                close()
                moveTo(18.303f, 8.903f)
                curveTo(18.303f, 7.829f, 18.029f, 6.976f, 17.48f, 6.345f)
                curveTo(16.914f, 5.714f, 16.173f, 5.39f, 15.252f, 5.39f)
                curveTo(14.187f, 5.39f, 13.38f, 5.799f, 12.847f, 6.618f)
                lineTo(12.329f, 7.487f)
                lineTo(11.81f, 6.618f)
                curveTo(11.277f, 5.799f, 10.471f, 5.39f, 9.406f, 5.39f)
                curveTo(8.485f, 5.39f, 7.743f, 5.714f, 7.177f, 6.345f)
                curveTo(6.628f, 6.976f, 6.355f, 7.829f, 6.355f, 8.903f)
                verticalLineTo(14.156f)
                horizontalLineTo(8.436f)
                verticalLineTo(9.057f)
                curveTo(8.436f, 7.982f, 8.888f, 7.437f, 9.793f, 7.437f)
                curveTo(10.793f, 7.437f, 11.294f, 8.084f, 11.294f, 9.364f)
                verticalLineTo(12.155f)
                horizontalLineTo(13.363f)
                verticalLineTo(9.364f)
                curveTo(13.363f, 8.084f, 13.865f, 7.437f, 14.865f, 7.437f)
                curveTo(15.769f, 7.437f, 16.222f, 7.982f, 16.222f, 9.057f)
                verticalLineTo(14.156f)
                horizontalLineTo(18.303f)
                verticalLineTo(8.903f)
                close()
            }
        }
        .build()
        return _mastodonFill!!
    }

private var _mastodonFill: ImageVector? = null
