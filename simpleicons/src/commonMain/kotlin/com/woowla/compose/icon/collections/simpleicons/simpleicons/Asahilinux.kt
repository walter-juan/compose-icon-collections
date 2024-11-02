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

public val Simpleicons.Asahilinux: ImageVector
    get() {
        if (_asahilinux != null) {
            return _asahilinux!!
        }
        _asahilinux = Builder(name = "Asahilinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.835f, 0.0f)
                lineToRelative(-1.72f, 1.323f)
                verticalLineToRelative(0.97f)
                horizontalLineToRelative(2.178f)
                close()
                moveTo(11.885f, 0.057f)
                lineTo(9.81f, 1.095f)
                lineToRelative(2.076f, 4.153f)
                close()
                moveTo(12.115f, 3.825f)
                lineTo(12.115f, 6.22f)
                lineToRelative(-1.057f, -2.113f)
                lineTo(6.43f, 5.678f)
                lineTo(12.0f, 8.009f)
                lineToRelative(5.57f, -2.331f)
                close()
                moveTo(6.21f, 5.835f)
                lineTo(0.533f, 15.957f)
                lineTo(11.885f, 24.0f)
                lineTo(11.885f, 8.21f)
                lineTo(6.222f, 5.84f)
                close()
                moveTo(17.79f, 5.835f)
                lineTo(17.778f, 5.839f)
                lineTo(12.178f, 8.184f)
                lineTo(19.69f, 18.633f)
                lineTo(23.467f, 15.958f)
                close()
                moveTo(13.835f, 13.761f)
                verticalLineToRelative(5.422f)
                lineToRelative(1.952f, -2.711f)
                close()
                moveTo(16.699f, 17.742f)
                lineTo(12.288f, 23.877f)
                lineTo(18.134f, 19.737f)
                close()
            }
        }
        .build()
        return _asahilinux!!
    }

private var _asahilinux: ImageVector? = null
