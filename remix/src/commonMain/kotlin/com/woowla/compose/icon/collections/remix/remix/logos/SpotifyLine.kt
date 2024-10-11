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

public val LogosGroup.SpotifyLine: ImageVector
    get() {
        if (_spotifyLine != null) {
            return _spotifyLine!!
        }
        _spotifyLine = Builder(name = "SpotifyLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.551f, 2.0f, 22.001f, 6.5f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5f, 17.501f, 22.0f, 12.001f, 22.0f)
                curveTo(6.501f, 22.0f, 2.001f, 17.5f, 2.001f, 12.0f)
                curveTo(2.001f, 6.5f, 6.501f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(12.001f, 4.0f)
                curveTo(7.606f, 4.0f, 4.001f, 7.605f, 4.001f, 12.0f)
                curveTo(4.001f, 16.395f, 7.606f, 20.0f, 12.001f, 20.0f)
                curveTo(16.396f, 20.0f, 20.001f, 16.395f, 20.001f, 12.0f)
                curveTo(20.001f, 7.586f, 16.428f, 4.0f, 12.001f, 4.0f)
                close()
                moveTo(15.751f, 16.65f)
                curveTo(13.401f, 15.2f, 10.451f, 14.899f, 6.95f, 15.699f)
                curveTo(6.602f, 15.801f, 6.301f, 15.55f, 6.201f, 15.25f)
                curveTo(6.101f, 14.899f, 6.351f, 14.6f, 6.651f, 14.5f)
                curveTo(10.451f, 13.649f, 13.751f, 14.0f, 16.351f, 15.6f)
                curveTo(16.701f, 15.75f, 16.75f, 16.149f, 16.602f, 16.45f)
                curveTo(16.402f, 16.749f, 16.052f, 16.85f, 15.751f, 16.65f)
                close()
                moveTo(16.75f, 13.95f)
                curveTo(14.051f, 12.3f, 9.951f, 11.8f, 6.801f, 12.8f)
                curveTo(6.402f, 12.9f, 5.951f, 12.7f, 5.851f, 12.3f)
                curveTo(5.751f, 11.9f, 5.951f, 11.449f, 6.351f, 11.349f)
                curveTo(10.001f, 10.25f, 14.501f, 10.801f, 17.601f, 12.7f)
                curveTo(17.902f, 12.851f, 18.051f, 13.35f, 17.802f, 13.7f)
                curveTo(17.551f, 14.05f, 17.101f, 14.2f, 16.75f, 13.95f)
                close()
                moveTo(6.301f, 9.751f)
                curveTo(5.801f, 9.9f, 5.301f, 9.6f, 5.151f, 9.15f)
                curveTo(5.001f, 8.649f, 5.301f, 8.15f, 5.751f, 7.999f)
                curveTo(9.301f, 6.949f, 15.151f, 7.149f, 18.852f, 9.35f)
                curveTo(19.301f, 9.6f, 19.451f, 10.2f, 19.201f, 10.65f)
                curveTo(18.952f, 11.001f, 18.351f, 11.149f, 17.902f, 10.9f)
                curveTo(14.701f, 9.0f, 9.351f, 8.8f, 6.301f, 9.751f)
                close()
            }
        }
        .build()
        return _spotifyLine!!
    }

private var _spotifyLine: ImageVector? = null
