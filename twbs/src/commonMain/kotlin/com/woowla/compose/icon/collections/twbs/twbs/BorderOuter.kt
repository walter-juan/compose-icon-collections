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

public val Twbs.BorderOuter: ImageVector
    get() {
        if (_borderOuter != null) {
            return _borderOuter!!
        }
        _borderOuter = Builder(name = "BorderOuter", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 1.906f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.938f)
                close()
                moveTo(7.5f, 3.781f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                lineTo(8.5f, 3.78f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.5f, 5.656f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.938f)
                close()
                moveTo(1.906f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(3.781f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                lineTo(3.78f, 7.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(5.656f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(8.469f, 8.5f)
                verticalLineToRelative(-0.031f)
                lineTo(8.5f, 8.469f)
                lineTo(8.5f, 7.53f)
                horizontalLineToRelative(-0.031f)
                lineTo(8.469f, 7.5f)
                lineTo(7.53f, 7.5f)
                verticalLineToRelative(0.031f)
                lineTo(7.5f, 7.531f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(0.031f)
                lineTo(7.531f, 8.5f)
                close()
                moveTo(9.406f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(11.281f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(13.156f, 8.5f)
                horizontalLineToRelative(0.938f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.938f)
                close()
                moveTo(7.5f, 9.406f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.938f)
                close()
                moveTo(7.5f, 11.281f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.938f)
                close()
                moveTo(7.5f, 13.156f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.938f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(16.0f, 0.0f)
                close()
                moveTo(1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                lineTo(1.0f, 15.0f)
                close()
            }
        }
        .build()
        return _borderOuter!!
    }

private var _borderOuter: ImageVector? = null
