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

public val Twbs.PeaceFill: ImageVector
    get() {
        if (_peaceFill != null) {
            return _peaceFill!!
        }
        _peaceFill = Builder(name = "PeaceFill", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.5f, 0.015f)
                verticalLineToRelative(7.778f)
                close()
                moveTo(13.292f, 14.0f)
                lineTo(8.5f, 9.206f)
                verticalLineToRelative(6.778f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 4.792f, -1.986f)
                close()
                moveTo(7.5f, 15.985f)
                lineTo(7.5f, 9.207f)
                lineTo(2.708f, 14.0f)
                arcTo(7.97f, 7.97f, 0.0f, false, false, 7.5f, 15.985f)
                moveTo(2.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.5f, 0.015f)
                verticalLineToRelative(7.778f)
                close()
            }
        }
        .build()
        return _peaceFill!!
    }

private var _peaceFill: ImageVector? = null
