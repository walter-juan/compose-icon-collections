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

public val SolidGroup.QuestionMarkCircle: ImageVector
    get() {
        if (_questionMarkCircle != null) {
            return _questionMarkCircle!!
        }
        _questionMarkCircle = Builder(name = "QuestionMarkCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 6.615f, 6.615f, 2.25f, 12.0f, 2.25f)
                curveTo(17.385f, 2.25f, 21.75f, 6.615f, 21.75f, 12.0f)
                curveTo(21.75f, 17.385f, 17.385f, 21.75f, 12.0f, 21.75f)
                curveTo(6.615f, 21.75f, 2.25f, 17.385f, 2.25f, 12.0f)
                close()
                moveTo(13.628f, 8.083f)
                curveTo(12.739f, 7.306f, 11.262f, 7.306f, 10.373f, 8.083f)
                curveTo(10.061f, 8.356f, 9.587f, 8.324f, 9.314f, 8.013f)
                curveTo(9.042f, 7.701f, 9.073f, 7.227f, 9.385f, 6.954f)
                curveTo(10.839f, 5.682f, 13.161f, 5.682f, 14.615f, 6.954f)
                curveTo(16.128f, 8.278f, 16.128f, 10.472f, 14.615f, 11.796f)
                curveTo(14.359f, 12.02f, 14.076f, 12.204f, 13.778f, 12.348f)
                curveTo(13.102f, 12.676f, 12.75f, 13.122f, 12.75f, 13.5f)
                verticalLineTo(14.25f)
                curveTo(12.75f, 14.664f, 12.414f, 15.0f, 12.0f, 15.0f)
                curveTo(11.586f, 15.0f, 11.25f, 14.664f, 11.25f, 14.25f)
                verticalLineTo(13.5f)
                curveTo(11.25f, 12.221f, 12.309f, 11.393f, 13.125f, 10.998f)
                curveTo(13.307f, 10.91f, 13.476f, 10.799f, 13.628f, 10.667f)
                curveTo(14.458f, 9.94f, 14.458f, 8.81f, 13.628f, 8.083f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(12.414f, 18.0f, 12.75f, 17.664f, 12.75f, 17.25f)
                curveTo(12.75f, 16.836f, 12.414f, 16.5f, 12.0f, 16.5f)
                curveTo(11.586f, 16.5f, 11.25f, 16.836f, 11.25f, 17.25f)
                curveTo(11.25f, 17.664f, 11.586f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _questionMarkCircle!!
    }

private var _questionMarkCircle: ImageVector? = null
