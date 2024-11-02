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

public val SolidGroup.CursorArrowRipple: ImageVector
    get() {
        if (_cursorArrowRipple != null) {
            return _cursorArrowRipple!!
        }
        _cursorArrowRipple = Builder(name = "CursorArrowRipple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.303f, 5.197f)
                curveTo(14.374f, 2.268f, 9.626f, 2.268f, 6.697f, 5.197f)
                curveTo(3.768f, 8.126f, 3.768f, 12.874f, 6.697f, 15.803f)
                curveTo(6.99f, 16.096f, 6.99f, 16.571f, 6.697f, 16.864f)
                curveTo(6.404f, 17.157f, 5.929f, 17.157f, 5.636f, 16.864f)
                curveTo(2.121f, 13.349f, 2.121f, 7.651f, 5.636f, 4.136f)
                curveTo(9.151f, 0.621f, 14.849f, 0.621f, 18.364f, 4.136f)
                curveTo(20.121f, 5.893f, 21.0f, 8.198f, 21.0f, 10.5f)
                curveTo(21.0f, 10.914f, 20.664f, 11.25f, 20.25f, 11.25f)
                curveTo(19.836f, 11.25f, 19.5f, 10.914f, 19.5f, 10.5f)
                curveTo(19.5f, 8.579f, 18.768f, 6.661f, 17.303f, 5.197f)
                close()
                moveTo(15.182f, 7.318f)
                curveTo(13.425f, 5.561f, 10.575f, 5.561f, 8.818f, 7.318f)
                curveTo(7.061f, 9.075f, 7.061f, 11.925f, 8.818f, 13.682f)
                curveTo(9.111f, 13.975f, 9.111f, 14.45f, 8.818f, 14.743f)
                curveTo(8.525f, 15.035f, 8.05f, 15.035f, 7.757f, 14.743f)
                curveTo(5.414f, 12.399f, 5.414f, 8.601f, 7.757f, 6.257f)
                curveTo(10.101f, 3.914f, 13.899f, 3.914f, 16.243f, 6.257f)
                curveTo(17.414f, 7.429f, 18.0f, 8.966f, 18.0f, 10.5f)
                curveTo(18.0f, 10.914f, 17.664f, 11.25f, 17.25f, 11.25f)
                curveTo(16.836f, 11.25f, 16.5f, 10.914f, 16.5f, 10.5f)
                curveTo(16.5f, 9.347f, 16.061f, 8.197f, 15.182f, 7.318f)
                close()
                moveTo(11.548f, 8.632f)
                curveTo(11.86f, 8.548f, 12.191f, 8.674f, 12.368f, 8.943f)
                lineTo(17.596f, 16.86f)
                curveTo(17.763f, 17.113f, 17.761f, 17.442f, 17.591f, 17.693f)
                curveTo(17.421f, 17.944f, 17.117f, 18.069f, 16.819f, 18.008f)
                lineTo(14.722f, 17.579f)
                lineTo(15.767f, 21.478f)
                curveTo(15.874f, 21.878f, 15.637f, 22.289f, 15.236f, 22.396f)
                curveTo(14.836f, 22.503f, 14.425f, 22.266f, 14.318f, 21.866f)
                lineTo(13.273f, 17.967f)
                lineTo(11.672f, 19.387f)
                curveTo(11.445f, 19.588f, 11.119f, 19.633f, 10.846f, 19.5f)
                curveTo(10.573f, 19.368f, 10.407f, 19.084f, 10.425f, 18.781f)
                lineTo(10.994f, 9.311f)
                curveTo(11.013f, 8.989f, 11.237f, 8.715f, 11.548f, 8.632f)
                close()
            }
        }
        .build()
        return _cursorArrowRipple!!
    }

private var _cursorArrowRipple: ImageVector? = null
