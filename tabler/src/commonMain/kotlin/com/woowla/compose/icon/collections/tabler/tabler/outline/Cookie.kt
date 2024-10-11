package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.148f, 3.476f)
                lineToRelative(2.667f, 1.104f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.656f, 6.14f)
                lineToRelative(0.053f, 0.132f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 2.296f)
                quadToRelative(-0.745f, 1.18f, -1.024f, 1.852f)
                quadToRelative(-0.283f, 0.684f, -0.66f, 2.216f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.624f, 1.623f)
                quadToRelative(-1.572f, 0.394f, -2.216f, 0.661f)
                quadToRelative(-0.712f, 0.295f, -1.852f, 1.024f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.296f, 0.0f)
                quadToRelative(-1.203f, -0.754f, -1.852f, -1.024f)
                quadToRelative(-0.707f, -0.292f, -2.216f, -0.66f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.623f, -1.624f)
                quadToRelative(-0.397f, -1.577f, -0.661f, -2.216f)
                quadToRelative(-0.298f, -0.718f, -1.024f, -1.852f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -2.296f)
                quadToRelative(0.719f, -1.116f, 1.024f, -1.852f)
                quadToRelative(0.257f, -0.62f, 0.66f, -2.216f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.624f, -1.623f)
                quadToRelative(1.547f, -0.384f, 2.216f, -0.661f)
                quadToRelative(0.687f, -0.285f, 1.852f, -1.024f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.296f, 0.0f)
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
