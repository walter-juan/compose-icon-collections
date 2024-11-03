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

public val Twbs.Thunderbolt: ImageVector
    get() {
        if (_thunderbolt != null) {
            return _thunderbolt!!
        }
        _thunderbolt = Builder(name = "Thunderbolt", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.293f, 12.0f)
                lineTo(2.0f, 13.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, 0.293f)
                horizontalLineToRelative(10.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.707f, -0.293f)
                lineTo(15.707f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, -0.707f)
                lineTo(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(1.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(7.293f)
                lineTo(13.293f, 13.0f)
                lineTo(2.707f, 13.0f)
                lineTo(1.0f, 11.293f)
                close()
            }
        }
        .build()
        return _thunderbolt!!
    }

private var _thunderbolt: ImageVector? = null
