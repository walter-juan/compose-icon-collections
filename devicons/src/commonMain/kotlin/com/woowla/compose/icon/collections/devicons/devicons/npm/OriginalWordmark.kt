package com.woowla.compose.icon.collections.devicons.devicons.npm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NpmGroup

public val NpmGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFcb3837)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 38.5f)
                horizontalLineToRelative(124.0f)
                verticalLineToRelative(43.71f)
                lineTo(64.0f, 82.21f)
                verticalLineToRelative(7.29f)
                lineTo(36.44f, 89.5f)
                verticalLineToRelative(-7.29f)
                lineTo(2.0f, 82.21f)
                close()
                moveTo(8.89f, 74.93f)
                horizontalLineToRelative(13.78f)
                lineTo(22.67f, 53.07f)
                horizontalLineToRelative(6.89f)
                verticalLineToRelative(21.86f)
                horizontalLineToRelative(6.89f)
                lineTo(36.45f, 45.79f)
                lineTo(8.89f, 45.79f)
                close()
                moveTo(43.33f, 45.79f)
                verticalLineToRelative(36.42f)
                horizontalLineToRelative(13.78f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(13.78f)
                lineTo(70.89f, 45.79f)
                close()
                moveTo(57.11f, 53.08f)
                lineTo(64.0f, 53.08f)
                verticalLineToRelative(14.56f)
                horizontalLineToRelative(-6.89f)
                close()
                moveTo(77.78f, 45.79f)
                verticalLineToRelative(29.14f)
                horizontalLineToRelative(13.78f)
                lineTo(91.56f, 53.07f)
                horizontalLineToRelative(6.89f)
                verticalLineToRelative(21.86f)
                horizontalLineToRelative(6.89f)
                lineTo(105.34f, 53.07f)
                horizontalLineToRelative(6.89f)
                verticalLineToRelative(21.86f)
                horizontalLineToRelative(6.89f)
                lineTo(119.12f, 45.79f)
                close()
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
