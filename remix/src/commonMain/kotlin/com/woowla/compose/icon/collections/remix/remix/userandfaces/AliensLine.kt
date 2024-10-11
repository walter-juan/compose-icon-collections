package com.woowla.compose.icon.collections.remix.remix.userandfaces

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.UserAndFacesGroup

public val UserAndFacesGroup.AliensLine: ImageVector
    get() {
        if (_aliensLine != null) {
            return _aliensLine!!
        }
        _aliensLine = Builder(name = "AliensLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(16.694f, 2.0f, 20.5f, 5.806f, 20.5f, 10.5f)
                curveTo(20.5f, 17.0f, 15.0f, 22.5f, 12.0f, 22.5f)
                curveTo(9.0f, 22.5f, 3.5f, 17.0f, 3.5f, 10.5f)
                curveTo(3.5f, 5.806f, 7.306f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(8.41f, 4.0f, 5.5f, 6.91f, 5.5f, 10.5f)
                curveTo(5.5f, 15.294f, 9.665f, 20.5f, 12.0f, 20.5f)
                curveTo(14.335f, 20.5f, 18.5f, 15.294f, 18.5f, 10.5f)
                curveTo(18.5f, 6.91f, 15.59f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(17.66f, 11.0f, 17.819f, 11.008f, 17.975f, 11.025f)
                curveTo(17.992f, 11.181f, 18.0f, 11.34f, 18.0f, 11.5f)
                curveTo(18.0f, 13.985f, 15.985f, 16.0f, 13.5f, 16.0f)
                curveTo(13.34f, 16.0f, 13.181f, 15.992f, 13.025f, 15.975f)
                curveTo(13.008f, 15.819f, 13.0f, 15.66f, 13.0f, 15.5f)
                curveTo(13.0f, 13.015f, 15.015f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(8.985f, 11.0f, 11.0f, 13.015f, 11.0f, 15.5f)
                curveTo(11.0f, 15.66f, 10.992f, 15.819f, 10.975f, 15.975f)
                curveTo(10.819f, 15.992f, 10.66f, 16.0f, 10.5f, 16.0f)
                curveTo(8.015f, 16.0f, 6.0f, 13.985f, 6.0f, 11.5f)
                curveTo(6.0f, 11.34f, 6.008f, 11.181f, 6.025f, 11.025f)
                curveTo(6.181f, 11.008f, 6.34f, 11.0f, 6.5f, 11.0f)
                close()
            }
        }
        .build()
        return _aliensLine!!
    }

private var _aliensLine: ImageVector? = null
