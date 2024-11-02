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

public val Simpleicons.Baserow: ImageVector
    get() {
        if (_baserow != null) {
            return _baserow!!
        }
        _baserow = Builder(name = "Baserow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.291f, 0.068f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 0.0f, 1.36f)
                verticalLineToRelative(3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.291f, 1.291f)
                horizontalLineToRelative(3.354f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.289f, -1.291f)
                lineTo(5.934f, 1.359f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 4.644f, 0.07f)
                close()
                moveTo(10.324f, 0.068f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, -1.29f, 1.291f)
                verticalLineToRelative(3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.29f, 1.291f)
                lineTo(22.71f, 6.002f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 24.0f, 4.711f)
                lineTo(24.0f, 1.359f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 22.709f, 0.07f)
                close()
                moveTo(1.291f, 9.033f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 0.0f, 10.323f)
                verticalLineToRelative(3.353f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.291f, 1.29f)
                horizontalLineToRelative(21.418f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 24.0f, 13.677f)
                verticalLineToRelative(-3.354f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, -1.291f, -1.289f)
                close()
                moveTo(1.291f, 17.998f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 0.0f, 19.289f)
                verticalLineToRelative(3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.291f, 1.29f)
                horizontalLineToRelative(12.385f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.29f, -1.29f)
                verticalLineToRelative(-3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, -1.29f, -1.291f)
                close()
                moveTo(19.355f, 17.998f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, -1.289f, 1.291f)
                verticalLineToRelative(3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, 1.29f, 1.29f)
                horizontalLineToRelative(3.353f)
                arcTo(1.29f, 1.29f, 0.0f, false, false, 24.0f, 22.642f)
                verticalLineToRelative(-3.352f)
                arcToRelative(1.29f, 1.29f, 0.0f, false, false, -1.291f, -1.291f)
                close()
            }
        }
        .build()
        return _baserow!!
    }

private var _baserow: ImageVector? = null
