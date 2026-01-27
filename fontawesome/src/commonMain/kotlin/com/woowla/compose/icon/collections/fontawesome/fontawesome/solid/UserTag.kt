package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.UserTag: ImageVector
    get() {
        if (_userTag != null) {
            return _userTag!!
        }
        _userTag = Builder(name = "UserTag", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.1f, 8.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, 240.0f)
                arcToRelative(120.0f, 120.0f, 0.0f, true, true, 0.0f, -240.0f)
                close()
                moveTo(226.4f, 304.0f)
                lineToRelative(59.4f, 0.0f)
                curveToRelative(6.7f, 0.0f, 13.2f, 0.4f, 19.7f, 1.1f)
                curveToRelative(-0.9f, 4.9f, -1.4f, 9.9f, -1.4f, 15.0f)
                lineToRelative(0.0f, 92.1f)
                curveToRelative(0.0f, 25.5f, 10.1f, 49.9f, 28.1f, 67.9f)
                lineToRelative(31.9f, 31.9f)
                lineToRelative(-286.3f, 0.0f)
                curveToRelative(-16.4f, 0.0f, -29.7f, -13.3f, -29.7f, -29.7f)
                curveToRelative(0.0f, -98.5f, 79.8f, -178.3f, 178.3f, -178.3f)
                close()
                moveTo(352.1f, 412.2f)
                lineToRelative(0.0f, -92.1f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(92.1f, 0.0f)
                curveToRelative(12.7f, 0.0f, 24.9f, 5.1f, 33.9f, 14.1f)
                lineToRelative(96.0f, 96.0f)
                curveToRelative(18.7f, 18.7f, 18.7f, 49.1f, 0.0f, 67.9f)
                lineToRelative(-76.1f, 76.1f)
                curveToRelative(-18.7f, 18.7f, -49.1f, 18.7f, -67.9f, 0.0f)
                lineToRelative(-96.0f, -96.0f)
                curveToRelative(-9.0f, -9.0f, -14.1f, -21.2f, -14.1f, -33.9f)
                close()
                moveTo(456.1f, 368.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
