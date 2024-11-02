package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.097f, 1.515f)
                curveTo(11.503f, 1.596f, 11.767f, 1.991f, 11.686f, 2.397f)
                lineTo(10.665f, 7.5f)
                horizontalLineTo(15.135f)
                lineTo(16.215f, 2.103f)
                curveTo(16.296f, 1.697f, 16.691f, 1.433f, 17.097f, 1.515f)
                curveTo(17.503f, 1.596f, 17.767f, 1.991f, 17.685f, 2.397f)
                lineTo(16.665f, 7.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 7.5f, 21.0f, 7.836f, 21.0f, 8.25f)
                curveTo(21.0f, 8.664f, 20.664f, 9.0f, 20.25f, 9.0f)
                horizontalLineTo(16.365f)
                lineTo(15.165f, 15.0f)
                horizontalLineTo(18.75f)
                curveTo(19.164f, 15.0f, 19.5f, 15.336f, 19.5f, 15.75f)
                curveTo(19.5f, 16.164f, 19.164f, 16.5f, 18.75f, 16.5f)
                horizontalLineTo(14.865f)
                lineTo(13.785f, 21.897f)
                curveTo(13.704f, 22.303f, 13.309f, 22.567f, 12.903f, 22.485f)
                curveTo(12.497f, 22.404f, 12.233f, 22.009f, 12.315f, 21.603f)
                lineTo(13.335f, 16.5f)
                horizontalLineTo(8.865f)
                lineTo(7.786f, 21.897f)
                curveTo(7.704f, 22.303f, 7.309f, 22.567f, 6.903f, 22.485f)
                curveTo(6.497f, 22.404f, 6.234f, 22.009f, 6.315f, 21.603f)
                lineTo(7.335f, 16.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 16.5f, 3.0f, 16.164f, 3.0f, 15.75f)
                curveTo(3.0f, 15.336f, 3.336f, 15.0f, 3.75f, 15.0f)
                horizontalLineTo(7.635f)
                lineTo(8.835f, 9.0f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 9.0f, 4.5f, 8.664f, 4.5f, 8.25f)
                curveTo(4.5f, 7.836f, 4.836f, 7.5f, 5.25f, 7.5f)
                horizontalLineTo(9.135f)
                lineTo(10.215f, 2.103f)
                curveTo(10.296f, 1.697f, 10.691f, 1.433f, 11.097f, 1.515f)
                close()
                moveTo(10.365f, 9.0f)
                lineTo(9.165f, 15.0f)
                horizontalLineTo(13.635f)
                lineTo(14.835f, 9.0f)
                horizontalLineTo(10.365f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
