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

public val MediaGroup.Speaker3Fill: ImageVector
    get() {
        if (_speaker3Fill != null) {
            return _speaker3Fill!!
        }
        _speaker3Fill = Builder(name = "Speaker3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 3.0f, 21.0f, 3.448f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.448f, 3.448f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(9.791f, 16.0f, 8.0f, 14.209f, 8.0f, 12.0f)
                curveTo(8.0f, 9.791f, 9.791f, 8.0f, 12.0f, 8.0f)
                curveTo(14.209f, 8.0f, 16.0f, 9.791f, 16.0f, 12.0f)
                curveTo(16.0f, 14.209f, 14.209f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(15.314f, 18.0f, 18.0f, 15.314f, 18.0f, 12.0f)
                curveTo(18.0f, 8.686f, 15.314f, 6.0f, 12.0f, 6.0f)
                curveTo(8.686f, 6.0f, 6.0f, 8.686f, 6.0f, 12.0f)
                curveTo(6.0f, 15.314f, 8.686f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(6.552f, 7.0f, 7.0f, 6.552f, 7.0f, 6.0f)
                curveTo(7.0f, 5.448f, 6.552f, 5.0f, 6.0f, 5.0f)
                curveTo(5.448f, 5.0f, 5.0f, 5.448f, 5.0f, 6.0f)
                curveTo(5.0f, 6.552f, 5.448f, 7.0f, 6.0f, 7.0f)
                close()
                moveTo(18.0f, 7.0f)
                curveTo(18.552f, 7.0f, 19.0f, 6.552f, 19.0f, 6.0f)
                curveTo(19.0f, 5.448f, 18.552f, 5.0f, 18.0f, 5.0f)
                curveTo(17.448f, 5.0f, 17.0f, 5.448f, 17.0f, 6.0f)
                curveTo(17.0f, 6.552f, 17.448f, 7.0f, 18.0f, 7.0f)
                close()
                moveTo(18.0f, 19.0f)
                curveTo(18.552f, 19.0f, 19.0f, 18.552f, 19.0f, 18.0f)
                curveTo(19.0f, 17.448f, 18.552f, 17.0f, 18.0f, 17.0f)
                curveTo(17.448f, 17.0f, 17.0f, 17.448f, 17.0f, 18.0f)
                curveTo(17.0f, 18.552f, 17.448f, 19.0f, 18.0f, 19.0f)
                close()
                moveTo(6.0f, 19.0f)
                curveTo(6.552f, 19.0f, 7.0f, 18.552f, 7.0f, 18.0f)
                curveTo(7.0f, 17.448f, 6.552f, 17.0f, 6.0f, 17.0f)
                curveTo(5.448f, 17.0f, 5.0f, 17.448f, 5.0f, 18.0f)
                curveTo(5.0f, 18.552f, 5.448f, 19.0f, 6.0f, 19.0f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(12.828f, 13.5f, 13.5f, 12.828f, 13.5f, 12.0f)
                curveTo(13.5f, 11.172f, 12.828f, 10.5f, 12.0f, 10.5f)
                curveTo(11.172f, 10.5f, 10.5f, 11.172f, 10.5f, 12.0f)
                curveTo(10.5f, 12.828f, 11.172f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _speaker3Fill!!
    }

private var _speaker3Fill: ImageVector? = null
