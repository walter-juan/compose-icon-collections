package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.DropletFill: ImageVector
    get() {
        if (_dropletFill != null) {
            return _dropletFill!!
        }
        _dropletFill = Builder(name = "DropletFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                curveToRelative(0.0f, -1.655f, -1.122f, -2.904f, -2.432f, -4.362f)
                curveTo(10.254f, 4.176f, 8.75f, 2.503f, 8.0f, 0.0f)
                curveToRelative(0.0f, 0.0f, -6.0f, 5.686f, -6.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                moveTo(6.646f, 4.646f)
                lineToRelative(0.708f, 0.708f)
                curveToRelative(-0.29f, 0.29f, -1.128f, 1.311f, -1.907f, 2.87f)
                lineToRelative(-0.894f, -0.448f)
                curveToRelative(0.82f, -1.641f, 1.717f, -2.753f, 2.093f, -3.13f)
            }
        }
        .build()
        return _dropletFill!!
    }

private var _dropletFill: ImageVector? = null
