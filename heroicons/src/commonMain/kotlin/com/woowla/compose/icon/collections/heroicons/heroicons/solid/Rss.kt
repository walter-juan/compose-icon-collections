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

public val SolidGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 4.5f)
                curveTo(3.75f, 4.086f, 4.086f, 3.75f, 4.5f, 3.75f)
                horizontalLineTo(5.25f)
                curveTo(13.534f, 3.75f, 20.25f, 10.466f, 20.25f, 18.75f)
                verticalLineTo(19.5f)
                curveTo(20.25f, 19.914f, 19.914f, 20.25f, 19.5f, 20.25f)
                horizontalLineTo(18.75f)
                curveTo(18.336f, 20.25f, 18.0f, 19.914f, 18.0f, 19.5f)
                verticalLineTo(18.75f)
                curveTo(18.0f, 11.708f, 12.292f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 6.0f, 3.75f, 5.664f, 3.75f, 5.25f)
                verticalLineTo(4.5f)
                close()
                moveTo(3.75f, 11.25f)
                curveTo(3.75f, 10.836f, 4.086f, 10.5f, 4.5f, 10.5f)
                horizontalLineTo(5.25f)
                curveTo(9.806f, 10.5f, 13.5f, 14.194f, 13.5f, 18.75f)
                verticalLineTo(19.5f)
                curveTo(13.5f, 19.914f, 13.164f, 20.25f, 12.75f, 20.25f)
                horizontalLineTo(12.0f)
                curveTo(11.586f, 20.25f, 11.25f, 19.914f, 11.25f, 19.5f)
                verticalLineTo(18.75f)
                curveTo(11.25f, 15.436f, 8.564f, 12.75f, 5.25f, 12.75f)
                horizontalLineTo(4.5f)
                curveTo(4.086f, 12.75f, 3.75f, 12.414f, 3.75f, 12.0f)
                verticalLineTo(11.25f)
                close()
                moveTo(3.75f, 18.75f)
                curveTo(3.75f, 17.922f, 4.422f, 17.25f, 5.25f, 17.25f)
                curveTo(6.078f, 17.25f, 6.75f, 17.922f, 6.75f, 18.75f)
                curveTo(6.75f, 19.578f, 6.078f, 20.25f, 5.25f, 20.25f)
                curveTo(4.422f, 20.25f, 3.75f, 19.578f, 3.75f, 18.75f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
