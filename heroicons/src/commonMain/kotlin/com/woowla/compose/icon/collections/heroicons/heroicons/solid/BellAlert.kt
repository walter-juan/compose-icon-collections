package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val SolidGroup.BellAlert: ImageVector
    get() {
        if (_bellAlert != null) {
            return _bellAlert!!
        }
        _bellAlert = Builder(name = "BellAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.85f, 3.5f)
                curveTo(6.127f, 3.192f, 6.1f, 2.717f, 5.792f, 2.441f)
                curveTo(5.483f, 2.165f, 5.009f, 2.191f, 4.733f, 2.5f)
                curveTo(3.532f, 3.842f, 2.696f, 5.519f, 2.385f, 7.376f)
                curveTo(2.316f, 7.784f, 2.592f, 8.171f, 3.0f, 8.24f)
                curveTo(3.409f, 8.308f, 3.795f, 8.033f, 3.864f, 7.624f)
                curveTo(4.127f, 6.056f, 4.833f, 4.637f, 5.85f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.267f, 2.5f)
                curveTo(18.991f, 2.191f, 18.517f, 2.165f, 18.208f, 2.441f)
                curveTo(17.899f, 2.717f, 17.873f, 3.192f, 18.149f, 3.5f)
                curveTo(19.167f, 4.637f, 19.873f, 6.056f, 20.136f, 7.624f)
                curveTo(20.204f, 8.033f, 20.591f, 8.308f, 21.0f, 8.24f)
                curveTo(21.408f, 8.171f, 21.684f, 7.784f, 21.615f, 7.376f)
                curveTo(21.304f, 5.519f, 20.468f, 3.842f, 19.267f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(8.272f, 2.25f, 5.25f, 5.272f, 5.25f, 9.0f)
                lineTo(5.25f, 9.75f)
                curveTo(5.25f, 11.873f, 4.449f, 13.807f, 3.131f, 15.27f)
                curveTo(2.965f, 15.455f, 2.901f, 15.71f, 2.96f, 15.952f)
                curveTo(3.02f, 16.193f, 3.195f, 16.389f, 3.429f, 16.476f)
                curveTo(4.973f, 17.045f, 6.589f, 17.466f, 8.26f, 17.719f)
                curveTo(8.254f, 17.812f, 8.25f, 17.906f, 8.25f, 18.0f)
                curveTo(8.25f, 20.071f, 9.929f, 21.75f, 12.0f, 21.75f)
                curveTo(14.071f, 21.75f, 15.75f, 20.071f, 15.75f, 18.0f)
                curveTo(15.75f, 17.906f, 15.747f, 17.812f, 15.74f, 17.719f)
                curveTo(17.41f, 17.466f, 19.027f, 17.045f, 20.571f, 16.476f)
                curveTo(20.804f, 16.389f, 20.98f, 16.193f, 21.039f, 15.952f)
                curveTo(21.099f, 15.71f, 21.035f, 15.455f, 20.868f, 15.27f)
                curveTo(19.551f, 13.807f, 18.75f, 11.873f, 18.75f, 9.75f)
                verticalLineTo(9.049f)
                lineTo(18.75f, 9.0f)
                curveTo(18.75f, 5.272f, 15.728f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.75f, 18.0f)
                curveTo(9.75f, 17.966f, 9.751f, 17.933f, 9.752f, 17.899f)
                curveTo(10.493f, 17.966f, 11.242f, 18.0f, 12.0f, 18.0f)
                curveTo(12.757f, 18.0f, 13.507f, 17.966f, 14.248f, 17.899f)
                curveTo(14.249f, 17.933f, 14.25f, 17.966f, 14.25f, 18.0f)
                curveTo(14.25f, 19.243f, 13.243f, 20.25f, 12.0f, 20.25f)
                curveTo(10.757f, 20.25f, 9.75f, 19.243f, 9.75f, 18.0f)
                close()
            }
        }
        .build()
        return _bellAlert!!
    }

private var _bellAlert: ImageVector? = null
