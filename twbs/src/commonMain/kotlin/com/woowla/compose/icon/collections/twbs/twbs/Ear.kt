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

public val Twbs.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 1.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 4.0f, 5.5f)
                verticalLineToRelative(7.047f)
                arcToRelative(2.453f, 2.453f, 0.0f, false, false, 4.75f, 0.861f)
                lineToRelative(0.512f, -1.363f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 0.816f, -1.46f)
                lineToRelative(2.008f, -2.581f)
                arcTo(4.34f, 4.34f, 0.0f, false, false, 8.66f, 1.0f)
                close()
                moveTo(3.0f, 5.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 8.5f, 0.0f)
                horizontalLineToRelative(0.16f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, true, 4.215f, 8.618f)
                lineToRelative(-2.008f, 2.581f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -0.67f, 1.197f)
                lineToRelative(-0.51f, 1.363f)
                arcTo(3.453f, 3.453f, 0.0f, false, true, 3.0f, 12.547f)
                close()
                moveTo(8.5f, 4.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 5.5f)
                verticalLineToRelative(2.695f)
                quadToRelative(0.168f, -0.09f, 0.332f, -0.192f)
                curveToRelative(0.327f, -0.208f, 0.577f, -0.44f, 0.72f, -0.727f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.895f, 0.448f)
                curveToRelative(-0.256f, 0.513f, -0.673f, 0.865f, -1.079f, 1.123f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 7.0f, 9.313f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineTo(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-0.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 4.0f)
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
