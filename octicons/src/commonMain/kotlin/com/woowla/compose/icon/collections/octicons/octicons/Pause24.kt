package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.Pause24: ImageVector
    get() {
        if (_pause24 != null) {
            return _pause24!!
        }
        _pause24 = Builder(name = "Pause24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineTo(7.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 21.0f)
                lineTo(9.0f, 21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 3.0f)
                close()
                moveTo(16.5f, 3.0f)
                lineTo(15.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 21.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _pause24!!
    }

private var _pause24: ImageVector? = null
