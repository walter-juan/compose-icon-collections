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

public val SolidGroup.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) {
            return _cloudArrowDown!!
        }
        _cloudArrowDown = Builder(name = "CloudArrowDown", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.75f, 9.75f)
                curveTo(12.75f, 9.336f, 12.414f, 9.0f, 12.0f, 9.0f)
                curveTo(11.586f, 9.0f, 11.25f, 9.336f, 11.25f, 9.75f)
                verticalLineTo(14.689f)
                lineTo(9.53f, 12.97f)
                curveTo(9.237f, 12.677f, 8.763f, 12.677f, 8.47f, 12.97f)
                curveTo(8.177f, 13.263f, 8.177f, 13.737f, 8.47f, 14.03f)
                lineTo(11.47f, 17.03f)
                curveTo(11.763f, 17.323f, 12.237f, 17.323f, 12.53f, 17.03f)
                lineTo(15.53f, 14.03f)
                curveTo(15.823f, 13.737f, 15.823f, 13.263f, 15.53f, 12.97f)
                curveTo(15.237f, 12.677f, 14.763f, 12.677f, 14.47f, 12.97f)
                lineTo(12.75f, 14.689f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
