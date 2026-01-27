package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.WrenchLine: ImageVector
    get() {
        if (_wrenchLine != null) {
            return _wrenchLine!!
        }
        _wrenchLine = Builder(name = "WrenchLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.038f, 6.378f)
                curveTo(19.267f, 6.149f, 19.594f, 6.045f, 19.914f, 6.1f)
                curveTo(20.234f, 6.155f, 20.507f, 6.362f, 20.646f, 6.654f)
                curveTo(21.889f, 9.255f, 21.435f, 12.466f, 19.279f, 14.622f)
                curveTo(17.446f, 16.455f, 14.851f, 17.057f, 12.517f, 16.434f)
                lineTo(8.673f, 20.279f)
                curveTo(7.306f, 21.646f, 5.09f, 21.646f, 3.723f, 20.279f)
                curveTo(2.356f, 18.912f, 2.356f, 16.696f, 3.723f, 15.329f)
                lineTo(7.568f, 11.484f)
                curveTo(6.945f, 9.151f, 7.547f, 6.555f, 9.38f, 4.722f)
                curveTo(11.536f, 2.566f, 14.747f, 2.113f, 17.347f, 3.355f)
                curveTo(17.64f, 3.495f, 17.847f, 3.768f, 17.902f, 4.088f)
                curveTo(17.956f, 4.408f, 17.853f, 4.734f, 17.623f, 4.964f)
                lineTo(15.037f, 7.551f)
                curveTo(14.646f, 7.941f, 14.646f, 8.574f, 15.037f, 8.965f)
                curveTo(15.427f, 9.355f, 16.06f, 9.355f, 16.451f, 8.965f)
                lineTo(19.038f, 6.378f)
                close()
                moveTo(17.865f, 10.379f)
                curveTo(16.693f, 11.551f, 14.794f, 11.551f, 13.622f, 10.379f)
                curveTo(12.451f, 9.208f, 12.451f, 7.308f, 13.622f, 6.137f)
                lineTo(15.037f, 4.722f)
                curveTo(13.533f, 4.508f, 11.95f, 4.981f, 10.794f, 6.137f)
                curveTo(9.368f, 7.562f, 8.981f, 9.637f, 9.641f, 11.415f)
                curveTo(9.777f, 11.781f, 9.687f, 12.193f, 9.411f, 12.469f)
                lineTo(5.137f, 16.743f)
                curveTo(4.551f, 17.329f, 4.551f, 18.279f, 5.137f, 18.865f)
                curveTo(5.723f, 19.45f, 6.673f, 19.45f, 7.258f, 18.865f)
                lineTo(11.532f, 14.591f)
                curveTo(11.809f, 14.315f, 12.22f, 14.225f, 12.587f, 14.361f)
                curveTo(14.365f, 15.02f, 16.439f, 14.633f, 17.865f, 13.208f)
                curveTo(19.021f, 12.052f, 19.494f, 10.469f, 19.28f, 8.964f)
                lineTo(17.865f, 10.379f)
                close()
            }
        }
        .build()
        return _wrenchLine!!
    }

private var _wrenchLine: ImageVector? = null
