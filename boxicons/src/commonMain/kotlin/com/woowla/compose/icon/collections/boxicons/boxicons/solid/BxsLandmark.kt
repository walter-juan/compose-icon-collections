package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsLandmark: ImageVector
    get() {
        if (_bxsLandmark != null) {
            return _bxsLandmark!!
        }
        _bxsLandmark = Builder(name = "BxsLandmark", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, -0.594f, -0.914f)
                lineToRelative(-9.432f, -4.191f)
                lineToRelative(-8.421f, 4.21f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 9.0f)
                close()
            }
        }
        .build()
        return _bxsLandmark!!
    }

private var _bxsLandmark: ImageVector? = null
