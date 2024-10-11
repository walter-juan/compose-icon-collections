package com.woowla.compose.icon.collections.remix.remix.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.MediaGroup

public val MediaGroup.PlayList2Line: ImageVector
    get() {
        if (_playList2Line != null) {
            return _playList2Line!!
        }
        _playList2Line = Builder(name = "PlayList2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(2.0f, 3.5f)
                lineTo(10.0f, 8.5f)
                lineTo(2.0f, 13.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(22.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.0f, 7.109f)
                verticalLineTo(9.892f)
                lineTo(6.226f, 8.5f)
                lineTo(4.0f, 7.109f)
                close()
                moveTo(22.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _playList2Line!!
    }

private var _playList2Line: ImageVector? = null
