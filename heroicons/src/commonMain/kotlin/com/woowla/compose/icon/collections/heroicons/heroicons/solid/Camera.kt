package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.Camera: ImageVector
    get() {
        if (_camera != null) {
            return _camera!!
        }
        _camera = Builder(name = "Camera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(9.929f, 9.0f, 8.25f, 10.679f, 8.25f, 12.75f)
                curveTo(8.25f, 14.821f, 9.929f, 16.5f, 12.0f, 16.5f)
                curveTo(14.071f, 16.5f, 15.75f, 14.821f, 15.75f, 12.75f)
                curveTo(15.75f, 10.679f, 14.071f, 9.0f, 12.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.344f, 3.071f)
                curveTo(10.224f, 3.024f, 11.109f, 3.0f, 12.0f, 3.0f)
                curveTo(12.891f, 3.0f, 13.776f, 3.024f, 14.656f, 3.071f)
                curveTo(15.623f, 3.123f, 16.485f, 3.656f, 16.988f, 4.462f)
                lineTo(17.809f, 5.778f)
                curveTo(18.049f, 6.161f, 18.454f, 6.421f, 18.92f, 6.487f)
                curveTo(19.305f, 6.542f, 19.689f, 6.601f, 20.071f, 6.665f)
                curveTo(21.503f, 6.904f, 22.5f, 8.158f, 22.5f, 9.574f)
                verticalLineTo(18.0f)
                curveTo(22.5f, 19.657f, 21.157f, 21.0f, 19.5f, 21.0f)
                horizontalLineTo(4.5f)
                curveTo(2.843f, 21.0f, 1.5f, 19.657f, 1.5f, 18.0f)
                verticalLineTo(9.574f)
                curveTo(1.5f, 8.158f, 2.497f, 6.904f, 3.929f, 6.665f)
                curveTo(4.311f, 6.601f, 4.695f, 6.542f, 5.08f, 6.487f)
                curveTo(5.546f, 6.421f, 5.952f, 6.161f, 6.191f, 5.778f)
                lineTo(7.012f, 4.462f)
                curveTo(7.515f, 3.656f, 8.377f, 3.123f, 9.344f, 3.071f)
                close()
                moveTo(6.75f, 12.75f)
                curveTo(6.75f, 9.851f, 9.101f, 7.5f, 12.0f, 7.5f)
                curveTo(14.899f, 7.5f, 17.25f, 9.851f, 17.25f, 12.75f)
                curveTo(17.25f, 15.649f, 14.899f, 18.0f, 12.0f, 18.0f)
                curveTo(9.101f, 18.0f, 6.75f, 15.649f, 6.75f, 12.75f)
                close()
                moveTo(18.75f, 11.25f)
                curveTo(19.164f, 11.25f, 19.5f, 10.914f, 19.5f, 10.5f)
                curveTo(19.5f, 10.086f, 19.164f, 9.75f, 18.75f, 9.75f)
                curveTo(18.336f, 9.75f, 18.0f, 10.086f, 18.0f, 10.5f)
                curveTo(18.0f, 10.914f, 18.336f, 11.25f, 18.75f, 11.25f)
                close()
            }
        }
        .build()
        return _camera!!
    }

private var _camera: ImageVector? = null
