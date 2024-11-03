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

public val Twbs.Mortarboard: ImageVector
    get() {
        if (_mortarboard != null) {
            return _mortarboard!!
        }
        _mortarboard = Builder(name = "Mortarboard", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.211f, 2.047f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.422f, 0.0f)
                lineToRelative(-7.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.025f, 0.917f)
                lineToRelative(7.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.372f, 0.0f)
                lineTo(14.0f, 7.14f)
                verticalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                verticalLineTo(6.739f)
                lineToRelative(0.686f, -0.275f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.025f, -0.917f)
                close()
                moveTo(8.0f, 8.46f)
                lineTo(1.758f, 5.965f)
                lineTo(8.0f, 3.052f)
                lineToRelative(6.242f, 2.913f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.176f, 9.032f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.656f, 0.327f)
                lineToRelative(-0.5f, 1.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.294f, 0.605f)
                lineToRelative(4.5f, 1.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.372f, 0.0f)
                lineToRelative(4.5f, -1.8f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.294f, -0.605f)
                lineToRelative(-0.5f, -1.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.656f, -0.327f)
                lineTo(8.0f, 10.466f)
                close()
                moveTo(4.108f, 10.905f)
                lineTo(4.328f, 10.157f)
                lineTo(7.824f, 11.468f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.352f, 0.0f)
                lineToRelative(3.496f, -1.311f)
                lineToRelative(0.22f, 0.748f)
                lineTo(8.0f, 12.46f)
                close()
            }
        }
        .build()
        return _mortarboard!!
    }

private var _mortarboard: ImageVector? = null
