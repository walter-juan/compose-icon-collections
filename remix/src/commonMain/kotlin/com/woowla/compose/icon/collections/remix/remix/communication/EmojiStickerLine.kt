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

public val CommunicationGroup.EmojiStickerLine: ImageVector
    get() {
        if (_emojiStickerLine != null) {
            return _emojiStickerLine!!
        }
        _emojiStickerLine = Builder(name = "EmojiStickerLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.52f, 19.863f)
                curveTo(10.595f, 18.662f, 10.883f, 17.517f, 11.346f, 16.468f)
                curveTo(9.811f, 16.325f, 8.419f, 15.687f, 7.333f, 14.715f)
                lineTo(8.667f, 13.225f)
                curveTo(9.552f, 14.017f, 10.719f, 14.498f, 12.0f, 14.498f)
                curveTo(12.176f, 14.498f, 12.35f, 14.489f, 12.521f, 14.471f)
                curveTo(14.227f, 12.217f, 16.866f, 10.708f, 19.863f, 10.52f)
                curveTo(19.169f, 6.809f, 15.913f, 4.0f, 12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 15.913f, 6.809f, 19.169f, 10.52f, 19.863f)
                close()
                moveTo(19.023f, 12.636f)
                curveTo(15.789f, 13.24f, 13.24f, 15.789f, 12.636f, 19.023f)
                lineTo(19.023f, 12.636f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 12.168f, 21.996f, 12.334f, 21.988f, 12.5f)
                lineTo(12.5f, 21.988f)
                curveTo(12.334f, 21.996f, 12.168f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(10.0f, 10.828f, 9.328f, 11.5f, 8.5f, 11.5f)
                curveTo(7.672f, 11.5f, 7.0f, 10.828f, 7.0f, 10.0f)
                curveTo(7.0f, 9.172f, 7.672f, 8.5f, 8.5f, 8.5f)
                curveTo(9.328f, 8.5f, 10.0f, 9.172f, 10.0f, 10.0f)
                close()
                moveTo(17.0f, 10.0f)
                curveTo(17.0f, 10.828f, 16.328f, 11.5f, 15.5f, 11.5f)
                curveTo(14.672f, 11.5f, 14.0f, 10.828f, 14.0f, 10.0f)
                curveTo(14.0f, 9.172f, 14.672f, 8.5f, 15.5f, 8.5f)
                curveTo(16.328f, 8.5f, 17.0f, 9.172f, 17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _emojiStickerLine!!
    }

private var _emojiStickerLine: ImageVector? = null
