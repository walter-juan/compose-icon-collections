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

public val SolidGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 9.75f)
                curveTo(4.5f, 6.436f, 7.186f, 3.75f, 10.5f, 3.75f)
                curveTo(13.028f, 3.75f, 15.189f, 5.313f, 16.073f, 7.524f)
                curveTo(16.213f, 7.508f, 16.356f, 7.5f, 16.5f, 7.5f)
                curveTo(18.571f, 7.5f, 20.25f, 9.179f, 20.25f, 11.25f)
                curveTo(20.25f, 11.446f, 20.235f, 11.639f, 20.206f, 11.827f)
                curveTo(21.574f, 12.598f, 22.5f, 14.065f, 22.5f, 15.75f)
                curveTo(22.5f, 18.235f, 20.485f, 20.25f, 18.0f, 20.25f)
                horizontalLineTo(6.75f)
                curveTo(3.851f, 20.25f, 1.5f, 17.899f, 1.5f, 15.0f)
                curveTo(1.5f, 12.897f, 2.736f, 11.084f, 4.52f, 10.246f)
                curveTo(4.507f, 10.082f, 4.5f, 9.917f, 4.5f, 9.75f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
