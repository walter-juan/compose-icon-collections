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

public val Twbs.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(3.362f)
                lineToRelative(-1.429f, 2.38f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.858f, 0.515f)
                lineToRelative(1.5f, -2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 8.5f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                verticalLineToRelative(1.07f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, false, -3.273f, 12.474f)
                lineToRelative(-0.602f, 0.602f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                lineToRelative(0.746f, -0.746f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 8.0f, 16.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, 3.422f, -0.892f)
                lineToRelative(0.746f, 0.746f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.708f)
                lineToRelative(-0.601f, -0.602f)
                arcTo(7.001f, 7.001f, 0.0f, false, false, 9.0f, 2.07f)
                lineTo(9.0f, 1.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(7.538f, 3.018f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.924f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -0.924f, 0.0f)
                moveTo(0.0f, 3.5f)
                curveToRelative(0.0f, 0.753f, 0.333f, 1.429f, 0.86f, 1.887f)
                arcTo(8.04f, 8.04f, 0.0f, false, true, 4.387f, 1.86f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 0.0f, 3.5f)
                moveTo(13.5f, 1.0f)
                curveToRelative(-0.753f, 0.0f, -1.429f, 0.333f, -1.887f, 0.86f)
                arcToRelative(8.04f, 8.04f, 0.0f, false, true, 3.527f, 3.527f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.5f, 1.0f)
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
