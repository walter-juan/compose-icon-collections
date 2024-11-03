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

public val Twbs.ConeStriped: ImageVector
    get() {
        if (_coneStriped != null) {
            return _coneStriped!!
        }
        _coneStriped = Builder(name = "ConeStriped", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.97f, 4.88f)
                lineToRelative(0.953f, 3.811f)
                curveTo(10.159f, 8.878f, 9.14f, 9.0f, 8.0f, 9.0f)
                reflectiveCurveToRelative(-2.158f, -0.122f, -2.923f, -0.309f)
                lineTo(6.03f, 4.88f)
                curveTo(6.635f, 4.957f, 7.3f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveToRelative(1.365f, -0.043f, 1.97f, -0.12f)
                moveToRelative(-0.245f, -0.978f)
                lineTo(8.97f, 0.88f)
                curveTo(8.718f, -0.13f, 7.282f, -0.13f, 7.03f, 0.88f)
                lineTo(6.275f, 3.9f)
                curveTo(6.8f, 3.965f, 7.382f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(1.2f, -0.036f, 1.725f, -0.098f)
                moveToRelative(4.396f, 8.613f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.037f, 0.96f)
                lineToRelative(-6.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.316f, 0.0f)
                lineToRelative(-6.0f, -2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.037f, -0.96f)
                lineToRelative(2.391f, -0.598f)
                lineToRelative(0.565f, -2.257f)
                curveToRelative(0.862f, 0.212f, 1.964f, 0.339f, 3.165f, 0.339f)
                reflectiveCurveToRelative(2.303f, -0.127f, 3.165f, -0.339f)
                lineToRelative(0.565f, 2.257f)
                close()
            }
        }
        .build()
        return _coneStriped!!
    }

private var _coneStriped: ImageVector? = null
