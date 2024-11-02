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

public val Simpleicons.Upcloud: ImageVector
    get() {
        if (_upcloud != null) {
            return _upcloud!!
        }
        _upcloud = Builder(name = "Upcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.115f, 12.996f)
                arcToRelative(1.885f, 1.885f, 0.0f, true, true, 0.0f, 3.769f)
                lineTo(8.664f, 16.765f)
                lineTo(8.664f, 11.87f)
                horizontalLineToRelative(0.888f)
                verticalLineToRelative(4.007f)
                horizontalLineToRelative(12.585f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 0.996f, -0.996f)
                arcToRelative(1.032f, 1.032f, 0.0f, false, false, -1.04f, -0.996f)
                lineTo(10.397f, 13.884f)
                verticalLineToRelative(-0.888f)
                close()
                moveTo(13.43f, 7.235f)
                lineTo(8.664f, 7.235f)
                verticalLineToRelative(1.993f)
                horizontalLineToRelative(0.888f)
                lineTo(9.552f, 8.101f)
                horizontalLineToRelative(3.899f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, true, 0.996f, 0.996f)
                arcToRelative(1.065f, 1.065f, 0.0f, false, true, -1.018f, 1.04f)
                lineTo(1.885f, 10.137f)
                arcToRelative(1.885f, 1.885f, 0.0f, true, false, 0.0f, 3.769f)
                horizontalLineToRelative(5.892f)
                verticalLineToRelative(-0.888f)
                lineTo(1.885f, 13.018f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, 0.0f, -1.993f)
                horizontalLineToRelative(11.567f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.884f, -1.885f)
                arcToRelative(1.938f, 1.938f, 0.0f, false, false, -1.906f, -1.906f)
                close()
            }
        }
        .build()
        return _upcloud!!
    }

private var _upcloud: ImageVector? = null
