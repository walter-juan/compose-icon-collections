package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Googlelens: ImageVector
    get() {
        if (_googlelens != null) {
            return _googlelens!!
        }
        _googlelens = Builder(name = "Googlelens", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.333f)
                quadToRelative(-1.667f, 0.0f, -2.833f, -1.166f)
                quadTo(8.0f, 15.0f, 8.0f, 13.333f)
                quadToRelative(0.0f, -1.666f, 1.167f, -2.833f)
                quadTo(10.333f, 9.333f, 12.0f, 9.333f)
                quadToRelative(1.667f, 0.0f, 2.833f, 1.167f)
                quadTo(16.0f, 11.667f, 16.0f, 13.333f)
                quadToRelative(0.0f, 1.667f, -1.167f, 2.834f)
                quadToRelative(-1.166f, 1.166f, -2.833f, 1.166f)
                close()
                moveTo(20.0f, 22.667f)
                quadToRelative(-1.1f, 0.0f, -1.883f, -0.784f)
                quadToRelative(-0.784f, -0.783f, -0.784f, -1.883f)
                reflectiveQuadToRelative(0.784f, -1.883f)
                quadToRelative(0.783f, -0.784f, 1.883f, -0.784f)
                reflectiveQuadToRelative(1.883f, 0.784f)
                quadToRelative(0.784f, 0.783f, 0.784f, 1.883f)
                reflectiveQuadToRelative(-0.784f, 1.883f)
                quadToRelative(-0.783f, 0.784f, -1.883f, 0.784f)
                close()
                moveTo(5.333f, 24.0f)
                quadToRelative(-2.2f, 0.0f, -3.766f, -1.567f)
                quadTo(0.0f, 20.867f, 0.0f, 18.667f)
                lineTo(0.0f, 16.0f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(2.667f)
                quadToRelative(0.0f, 1.1f, 0.783f, 1.883f)
                quadToRelative(0.783f, 0.783f, 1.883f, 0.783f)
                lineTo(12.0f, 21.333f)
                lineTo(12.0f, 24.0f)
                close()
                moveTo(21.333f, 13.333f)
                lineTo(21.333f, 8.0f)
                quadToRelative(0.0f, -1.1f, -0.783f, -1.883f)
                quadToRelative(-0.783f, -0.784f, -1.883f, -0.784f)
                lineTo(5.333f, 5.333f)
                quadToRelative(-1.1f, 0.0f, -1.883f, 0.784f)
                quadTo(2.667f, 6.9f, 2.667f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 12.0f)
                lineTo(0.0f, 8.0f)
                quadToRelative(0.0f, -2.2f, 1.567f, -3.767f)
                quadToRelative(1.566f, -1.566f, 3.766f, -1.566f)
                lineTo(8.0f, 2.667f)
                lineTo(9.333f, 0.0f)
                horizontalLineToRelative(5.334f)
                lineTo(16.0f, 2.667f)
                horizontalLineToRelative(2.667f)
                quadToRelative(2.2f, 0.0f, 3.766f, 1.566f)
                quadTo(24.0f, 5.8f, 24.0f, 8.0f)
                verticalLineToRelative(5.333f)
                close()
            }
        }
        .build()
        return _googlelens!!
    }

private var _googlelens: ImageVector? = null
