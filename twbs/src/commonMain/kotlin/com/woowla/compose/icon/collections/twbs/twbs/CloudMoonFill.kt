package com.woowla.compose.icon.collections.twbs.twbs

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
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.CloudMoonFill: ImageVector
    get() {
        if (_cloudMoonFill != null) {
            return _cloudMoonFill!!
        }
        _cloudMoonFill = Builder(name = "CloudMoonFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.473f, 11.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -8.72f, -0.99f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 16.0f)
                horizontalLineToRelative(8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.286f, 1.778f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.565f, -0.755f)
                arcToRelative(4.595f, 4.595f, 0.0f, false, false, -3.18f, 5.003f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.055f, 0.209f)
                arcTo(3.6f, 3.6f, 0.0f, false, true, 9.83f, 2.617f)
                arcToRelative(4.593f, 4.593f, 0.0f, false, false, 4.31f, 5.744f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -2.241f, 0.634f)
                quadToRelative(0.244f, 0.477f, 0.394f, 1.0f)
                arcToRelative(4.59f, 4.59f, 0.0f, false, false, 3.624f, -2.04f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.565f, -0.755f)
                arcToRelative(3.593f, 3.593f, 0.0f, false, true, -4.065f, -5.422f)
                close()
            }
        }
        .build()
        return _cloudMoonFill!!
    }

private var _cloudMoonFill: ImageVector? = null
