package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.SpeakerWave: ImageVector
    get() {
        if (_speakerWave != null) {
            return _speakerWave!!
        }
        _speakerWave = Builder(name = "SpeakerWave", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 4.061f)
                curveTo(13.5f, 2.724f, 11.884f, 2.055f, 10.939f, 3.0f)
                lineTo(6.439f, 7.5f)
                horizontalLineTo(4.509f)
                curveTo(3.368f, 7.5f, 2.191f, 8.164f, 1.849f, 9.405f)
                curveTo(1.621f, 10.232f, 1.5f, 11.102f, 1.5f, 12.0f)
                curveTo(1.5f, 12.898f, 1.621f, 13.768f, 1.849f, 14.595f)
                curveTo(2.191f, 15.836f, 3.368f, 16.5f, 4.509f, 16.5f)
                horizontalLineTo(6.439f)
                lineTo(10.939f, 21.0f)
                curveTo(11.884f, 21.945f, 13.5f, 21.276f, 13.5f, 19.939f)
                verticalLineTo(4.061f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.584f, 5.106f)
                curveTo(18.877f, 4.813f, 19.351f, 4.813f, 19.644f, 5.106f)
                curveTo(23.452f, 8.913f, 23.452f, 15.087f, 19.644f, 18.894f)
                curveTo(19.351f, 19.187f, 18.877f, 19.187f, 18.584f, 18.894f)
                curveTo(18.291f, 18.601f, 18.291f, 18.126f, 18.584f, 17.834f)
                curveTo(21.806f, 14.612f, 21.806f, 9.388f, 18.584f, 6.166f)
                curveTo(18.291f, 5.873f, 18.291f, 5.399f, 18.584f, 5.106f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.932f, 7.757f)
                curveTo(16.225f, 7.465f, 16.7f, 7.465f, 16.993f, 7.757f)
                curveTo(19.336f, 10.101f, 19.336f, 13.899f, 16.993f, 16.243f)
                curveTo(16.7f, 16.536f, 16.225f, 16.536f, 15.932f, 16.243f)
                curveTo(15.639f, 15.95f, 15.639f, 15.475f, 15.932f, 15.182f)
                curveTo(17.69f, 13.425f, 17.69f, 10.575f, 15.932f, 8.818f)
                curveTo(15.639f, 8.525f, 15.639f, 8.05f, 15.932f, 7.757f)
                close()
            }
        }
        .build()
        return _speakerWave!!
    }

private var _speakerWave: ImageVector? = null
