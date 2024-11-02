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

public val SolidGroup.FaceFrown: ImageVector
    get() {
        if (_faceFrown != null) {
            return _faceFrown!!
        }
        _faceFrown = Builder(name = "FaceFrown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.375f, 8.25f)
                curveTo(8.834f, 8.25f, 8.547f, 8.669f, 8.439f, 8.884f)
                curveTo(8.309f, 9.145f, 8.25f, 9.452f, 8.25f, 9.75f)
                curveTo(8.25f, 10.048f, 8.309f, 10.355f, 8.439f, 10.616f)
                curveTo(8.547f, 10.831f, 8.834f, 11.25f, 9.375f, 11.25f)
                curveTo(9.916f, 11.25f, 10.203f, 10.831f, 10.311f, 10.616f)
                curveTo(10.441f, 10.355f, 10.5f, 10.048f, 10.5f, 9.75f)
                curveTo(10.5f, 9.452f, 10.441f, 9.145f, 10.311f, 8.884f)
                curveTo(10.203f, 8.669f, 9.916f, 8.25f, 9.375f, 8.25f)
                close()
                moveTo(13.689f, 8.884f)
                curveTo(13.797f, 8.669f, 14.084f, 8.25f, 14.625f, 8.25f)
                curveTo(15.166f, 8.25f, 15.453f, 8.669f, 15.561f, 8.884f)
                curveTo(15.691f, 9.145f, 15.75f, 9.452f, 15.75f, 9.75f)
                curveTo(15.75f, 10.048f, 15.691f, 10.355f, 15.561f, 10.616f)
                curveTo(15.453f, 10.831f, 15.166f, 11.25f, 14.625f, 11.25f)
                curveTo(14.084f, 11.25f, 13.797f, 10.831f, 13.689f, 10.616f)
                curveTo(13.559f, 10.355f, 13.5f, 10.048f, 13.5f, 9.75f)
                curveTo(13.5f, 9.452f, 13.559f, 9.145f, 13.689f, 8.884f)
                close()
                moveTo(9.349f, 16.848f)
                curveTo(9.056f, 17.141f, 8.581f, 17.141f, 8.288f, 16.848f)
                curveTo(7.995f, 16.555f, 7.995f, 16.08f, 8.288f, 15.788f)
                curveTo(9.318f, 14.758f, 10.67f, 14.245f, 12.018f, 14.25f)
                curveTo(13.355f, 14.255f, 14.692f, 14.767f, 15.713f, 15.788f)
                curveTo(16.006f, 16.08f, 16.006f, 16.555f, 15.713f, 16.848f)
                curveTo(15.42f, 17.141f, 14.945f, 17.141f, 14.652f, 16.848f)
                curveTo(13.923f, 16.119f, 12.97f, 15.753f, 12.013f, 15.75f)
                curveTo(11.048f, 15.747f, 10.084f, 16.113f, 9.349f, 16.848f)
                close()
            }
        }
        .build()
        return _faceFrown!!
    }

private var _faceFrown: ImageVector? = null
