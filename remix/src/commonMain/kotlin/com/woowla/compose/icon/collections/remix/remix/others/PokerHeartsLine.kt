package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PokerHeartsLine: ImageVector
    get() {
        if (_pokerHeartsLine != null) {
            return _pokerHeartsLine!!
        }
        _pokerHeartsLine = Builder(name = "PokerHeartsLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.811f)
                lineTo(13.635f, 6.488f)
                curveTo(14.272f, 5.584f, 15.318f, 5.0f, 16.5f, 5.0f)
                curveTo(18.433f, 5.0f, 20.0f, 6.567f, 20.0f, 8.5f)
                curveTo(20.0f, 11.379f, 18.041f, 14.122f, 15.643f, 16.336f)
                curveTo(14.488f, 17.403f, 13.324f, 18.26f, 12.445f, 18.852f)
                curveTo(12.286f, 18.959f, 12.137f, 19.057f, 12.0f, 19.146f)
                curveTo(11.863f, 19.057f, 11.714f, 18.959f, 11.555f, 18.852f)
                curveTo(10.676f, 18.26f, 9.512f, 17.403f, 8.357f, 16.336f)
                curveTo(5.959f, 14.122f, 4.0f, 11.379f, 4.0f, 8.5f)
                curveTo(4.0f, 6.567f, 5.567f, 5.0f, 7.5f, 5.0f)
                curveTo(8.682f, 5.0f, 9.728f, 5.584f, 10.365f, 6.488f)
                lineTo(12.0f, 8.811f)
                close()
                moveTo(10.556f, 3.926f)
                curveTo(9.682f, 3.341f, 8.631f, 3.0f, 7.5f, 3.0f)
                curveTo(4.462f, 3.0f, 2.0f, 5.462f, 2.0f, 8.5f)
                curveTo(2.0f, 16.0f, 12.0f, 21.485f, 12.0f, 21.485f)
                curveTo(12.0f, 21.485f, 22.0f, 16.0f, 22.0f, 8.5f)
                curveTo(22.0f, 5.462f, 19.538f, 3.0f, 16.5f, 3.0f)
                curveTo(15.369f, 3.0f, 14.318f, 3.341f, 13.444f, 3.926f)
                curveTo(12.88f, 4.304f, 12.39f, 4.783f, 12.0f, 5.337f)
                curveTo(11.61f, 4.783f, 11.12f, 4.304f, 10.556f, 3.926f)
                close()
            }
        }
        .build()
        return _pokerHeartsLine!!
    }

private var _pokerHeartsLine: ImageVector? = null
