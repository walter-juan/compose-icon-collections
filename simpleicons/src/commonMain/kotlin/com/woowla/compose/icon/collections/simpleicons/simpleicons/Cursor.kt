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

public val Simpleicons.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.503f, 0.131f)
                lineTo(1.891f, 5.678f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.42f, 0.726f)
                verticalLineToRelative(11.188f)
                curveToRelative(0.0f, 0.3f, 0.162f, 0.575f, 0.42f, 0.724f)
                lineToRelative(9.609f, 5.55f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.998f, 0.0f)
                lineToRelative(9.61f, -5.55f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, 0.42f, -0.724f)
                verticalLineTo(6.404f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.42f, -0.726f)
                lineTo(12.497f, 0.131f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, false, -0.996f, 0.0f)
                moveTo(2.657f, 6.338f)
                horizontalLineToRelative(18.55f)
                curveToRelative(0.263f, 0.0f, 0.43f, 0.287f, 0.297f, 0.515f)
                lineTo(12.23f, 22.918f)
                curveToRelative(-0.062f, 0.107f, -0.229f, 0.064f, -0.229f, -0.06f)
                verticalLineTo(12.335f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.295f, -0.51f)
                lineToRelative(-9.11f, -5.257f)
                curveToRelative(-0.109f, -0.063f, -0.064f, -0.23f, 0.061f, -0.23f)
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
