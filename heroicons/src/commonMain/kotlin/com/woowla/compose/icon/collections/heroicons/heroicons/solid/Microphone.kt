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

public val SolidGroup.Microphone: ImageVector
    get() {
        if (_microphone != null) {
            return _microphone!!
        }
        _microphone = Builder(name = "Microphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 4.5f)
                curveTo(8.25f, 2.429f, 9.929f, 0.75f, 12.0f, 0.75f)
                curveTo(14.071f, 0.75f, 15.75f, 2.429f, 15.75f, 4.5f)
                verticalLineTo(12.75f)
                curveTo(15.75f, 14.821f, 14.071f, 16.5f, 12.0f, 16.5f)
                curveTo(9.929f, 16.5f, 8.25f, 14.821f, 8.25f, 12.75f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 10.5f)
                curveTo(6.414f, 10.5f, 6.75f, 10.836f, 6.75f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(6.75f, 15.649f, 9.101f, 18.0f, 12.0f, 18.0f)
                curveTo(14.899f, 18.0f, 17.25f, 15.649f, 17.25f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(17.25f, 10.836f, 17.586f, 10.5f, 18.0f, 10.5f)
                curveTo(18.414f, 10.5f, 18.75f, 10.836f, 18.75f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(18.75f, 16.224f, 16.125f, 19.086f, 12.75f, 19.459f)
                verticalLineTo(21.75f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 21.75f, 16.5f, 22.086f, 16.5f, 22.5f)
                curveTo(16.5f, 22.914f, 16.164f, 23.25f, 15.75f, 23.25f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 23.25f, 7.5f, 22.914f, 7.5f, 22.5f)
                curveTo(7.5f, 22.086f, 7.836f, 21.75f, 8.25f, 21.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(19.459f)
                curveTo(7.875f, 19.086f, 5.25f, 16.224f, 5.25f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(5.25f, 10.836f, 5.586f, 10.5f, 6.0f, 10.5f)
                close()
            }
        }
        .build()
        return _microphone!!
    }

private var _microphone: ImageVector? = null
