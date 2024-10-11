package com.woowla.compose.icon.collections.remix.remix.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.CommunicationGroup

public val CommunicationGroup.EmojiStickerFill: ImageVector
    get() {
        if (_emojiStickerFill != null) {
            return _emojiStickerFill!!
        }
        _emojiStickerFill = Builder(name = "EmojiStickerFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.902f, 10.598f)
                curveTo(21.444f, 10.533f, 20.976f, 10.5f, 20.5f, 10.5f)
                curveTo(17.24f, 10.5f, 14.345f, 12.06f, 12.521f, 14.471f)
                curveTo(12.35f, 14.489f, 12.176f, 14.498f, 12.0f, 14.498f)
                curveTo(10.719f, 14.498f, 9.552f, 14.017f, 8.667f, 13.225f)
                lineTo(7.333f, 14.715f)
                curveTo(8.419f, 15.687f, 9.811f, 16.325f, 11.347f, 16.468f)
                curveTo(10.802f, 17.702f, 10.5f, 19.066f, 10.5f, 20.5f)
                curveTo(10.5f, 20.976f, 10.533f, 21.444f, 10.598f, 21.902f)
                curveTo(5.739f, 21.221f, 2.0f, 17.047f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.047f, 2.0f, 21.221f, 5.739f, 21.902f, 10.598f)
                close()
                moveTo(21.871f, 12.617f)
                curveTo(21.425f, 12.54f, 20.967f, 12.5f, 20.5f, 12.5f)
                curveTo(17.766f, 12.5f, 15.351f, 13.871f, 13.907f, 15.967f)
                curveTo(13.019f, 17.256f, 12.5f, 18.816f, 12.5f, 20.5f)
                curveTo(12.5f, 20.967f, 12.54f, 21.425f, 12.617f, 21.871f)
                lineTo(21.871f, 12.617f)
                close()
                moveTo(8.5f, 11.5f)
                curveTo(9.328f, 11.5f, 10.0f, 10.828f, 10.0f, 10.0f)
                curveTo(10.0f, 9.172f, 9.328f, 8.5f, 8.5f, 8.5f)
                curveTo(7.672f, 8.5f, 7.0f, 9.172f, 7.0f, 10.0f)
                curveTo(7.0f, 10.828f, 7.672f, 11.5f, 8.5f, 11.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveTo(16.328f, 11.5f, 17.0f, 10.828f, 17.0f, 10.0f)
                curveTo(17.0f, 9.172f, 16.328f, 8.5f, 15.5f, 8.5f)
                curveTo(14.672f, 8.5f, 14.0f, 9.172f, 14.0f, 10.0f)
                curveTo(14.0f, 10.828f, 14.672f, 11.5f, 15.5f, 11.5f)
                close()
            }
        }
        .build()
        return _emojiStickerFill!!
    }

private var _emojiStickerFill: ImageVector? = null
