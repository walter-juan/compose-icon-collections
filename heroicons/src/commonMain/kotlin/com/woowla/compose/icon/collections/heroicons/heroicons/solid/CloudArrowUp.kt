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

public val SolidGroup.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) {
            return _cloudArrowUp!!
        }
        _cloudArrowUp = Builder(name = "CloudArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.75f)
                curveTo(7.186f, 3.75f, 4.5f, 6.436f, 4.5f, 9.75f)
                curveTo(4.5f, 9.917f, 4.507f, 10.082f, 4.52f, 10.246f)
                curveTo(2.736f, 11.084f, 1.5f, 12.897f, 1.5f, 15.0f)
                curveTo(1.5f, 17.899f, 3.851f, 20.25f, 6.75f, 20.25f)
                horizontalLineTo(18.0f)
                curveTo(20.485f, 20.25f, 22.5f, 18.235f, 22.5f, 15.75f)
                curveTo(22.5f, 14.065f, 21.574f, 12.598f, 20.206f, 11.827f)
                curveTo(20.235f, 11.639f, 20.25f, 11.446f, 20.25f, 11.25f)
                curveTo(20.25f, 9.179f, 18.571f, 7.5f, 16.5f, 7.5f)
                curveTo(16.356f, 7.5f, 16.213f, 7.508f, 16.073f, 7.524f)
                curveTo(15.189f, 5.313f, 13.028f, 3.75f, 10.5f, 3.75f)
                close()
                moveTo(12.53f, 9.22f)
                curveTo(12.237f, 8.927f, 11.763f, 8.927f, 11.47f, 9.22f)
                lineTo(8.47f, 12.22f)
                curveTo(8.177f, 12.513f, 8.177f, 12.987f, 8.47f, 13.28f)
                curveTo(8.763f, 13.573f, 9.237f, 13.573f, 9.53f, 13.28f)
                lineTo(11.25f, 11.561f)
                lineTo(11.25f, 16.5f)
                curveTo(11.25f, 16.914f, 11.586f, 17.25f, 12.0f, 17.25f)
                curveTo(12.414f, 17.25f, 12.75f, 16.914f, 12.75f, 16.5f)
                verticalLineTo(11.561f)
                lineTo(14.47f, 13.28f)
                curveTo(14.763f, 13.573f, 15.237f, 13.573f, 15.53f, 13.28f)
                curveTo(15.823f, 12.987f, 15.823f, 12.513f, 15.53f, 12.22f)
                lineTo(12.53f, 9.22f)
                close()
            }
        }
        .build()
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
