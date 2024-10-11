package com.woowla.compose.icon.collections.remix.remix.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.BuildingsGroup

public val BuildingsGroup.Store2Fill: ImageVector
    get() {
        if (_store2Fill != null) {
            return _store2Fill!!
        }
        _store2Fill = Builder(name = "Store2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.242f)
                curveTo(1.794f, 12.435f, 1.0f, 11.06f, 1.0f, 9.5f)
                curveTo(1.0f, 8.673f, 1.224f, 7.876f, 1.633f, 7.197f)
                lineTo(4.345f, 2.5f)
                curveTo(4.524f, 2.191f, 4.854f, 2.0f, 5.211f, 2.0f)
                horizontalLineTo(18.789f)
                curveTo(19.146f, 2.0f, 19.476f, 2.191f, 19.655f, 2.5f)
                lineTo(22.358f, 7.182f)
                curveTo(22.776f, 7.876f, 23.0f, 8.673f, 23.0f, 9.5f)
                curveTo(23.0f, 11.06f, 22.206f, 12.435f, 21.0f, 13.242f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(5.789f, 4.0f)
                lineTo(3.356f, 8.213f)
                curveTo(3.124f, 8.598f, 3.0f, 9.039f, 3.0f, 9.5f)
                curveTo(3.0f, 10.881f, 4.119f, 12.0f, 5.5f, 12.0f)
                curveTo(6.531f, 12.0f, 7.445f, 11.37f, 7.822f, 10.429f)
                curveTo(8.157f, 9.592f, 9.343f, 9.592f, 9.678f, 10.429f)
                curveTo(10.055f, 11.37f, 10.969f, 12.0f, 12.0f, 12.0f)
                curveTo(13.031f, 12.0f, 13.945f, 11.37f, 14.322f, 10.429f)
                curveTo(14.657f, 9.592f, 15.843f, 9.592f, 16.178f, 10.429f)
                curveTo(16.555f, 11.37f, 17.469f, 12.0f, 18.5f, 12.0f)
                curveTo(19.881f, 12.0f, 21.0f, 10.881f, 21.0f, 9.5f)
                curveTo(21.0f, 9.039f, 20.876f, 8.598f, 20.635f, 8.197f)
                lineTo(18.211f, 4.0f)
                horizontalLineTo(5.789f)
                close()
            }
        }
        .build()
        return _store2Fill!!
    }

private var _store2Fill: ImageVector? = null
