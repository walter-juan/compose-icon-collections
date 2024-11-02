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

public val SolidGroup.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = Builder(name = "Beaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.798f)
                verticalLineTo(8.818f)
                curveTo(10.5f, 9.614f, 10.184f, 10.377f, 9.621f, 10.939f)
                lineTo(7.244f, 13.316f)
                curveTo(8.992f, 13.192f, 10.758f, 13.54f, 12.335f, 14.329f)
                curveTo(14.099f, 15.211f, 16.139f, 15.442f, 18.048f, 14.965f)
                lineTo(18.333f, 14.894f)
                lineTo(14.379f, 10.939f)
                curveTo(13.816f, 10.377f, 13.5f, 9.614f, 13.5f, 8.818f)
                verticalLineTo(3.798f)
                curveTo(13.004f, 3.766f, 12.504f, 3.75f, 12.0f, 3.75f)
                curveTo(11.496f, 3.75f, 10.996f, 3.766f, 10.5f, 3.798f)
                close()
                moveTo(15.0f, 3.936f)
                curveTo(15.373f, 3.936f, 15.697f, 3.658f, 15.744f, 3.278f)
                curveTo(15.795f, 2.867f, 15.504f, 2.493f, 15.093f, 2.441f)
                curveTo(14.836f, 2.409f, 14.578f, 2.381f, 14.319f, 2.357f)
                curveTo(13.556f, 2.286f, 12.782f, 2.25f, 12.0f, 2.25f)
                curveTo(11.218f, 2.25f, 10.444f, 2.286f, 9.681f, 2.357f)
                curveTo(9.422f, 2.381f, 9.164f, 2.409f, 8.907f, 2.441f)
                curveTo(8.496f, 2.493f, 8.205f, 2.867f, 8.256f, 3.278f)
                curveTo(8.303f, 3.658f, 8.627f, 3.936f, 9.0f, 3.936f)
                verticalLineTo(8.818f)
                curveTo(9.0f, 9.216f, 8.842f, 9.597f, 8.561f, 9.879f)
                lineTo(2.267f, 16.172f)
                curveTo(0.646f, 17.793f, 1.364f, 20.647f, 3.738f, 21.053f)
                curveTo(6.424f, 21.511f, 9.184f, 21.75f, 12.0f, 21.75f)
                curveTo(14.816f, 21.75f, 17.576f, 21.511f, 20.262f, 21.053f)
                curveTo(22.635f, 20.647f, 23.354f, 17.793f, 21.733f, 16.172f)
                lineTo(15.439f, 9.879f)
                curveTo(15.158f, 9.597f, 15.0f, 9.216f, 15.0f, 8.818f)
                verticalLineTo(3.936f)
                close()
            }
        }
        .build()
        return _beaker!!
    }

private var _beaker: ImageVector? = null
