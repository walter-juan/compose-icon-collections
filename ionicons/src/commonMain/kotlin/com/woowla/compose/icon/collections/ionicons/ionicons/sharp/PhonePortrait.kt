package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.PhonePortrait: ImageVector
    get() {
        if (_phonePortrait != null) {
            return _phonePortrait!!
        }
        _phonePortrait = Builder(name = "PhonePortrait", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(382.0f, 0.0f)
                horizontalLineTo(130.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineTo(494.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, 18.0f)
                horizontalLineTo(382.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                verticalLineTo(18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 382.0f, 0.0f)
                close()
                moveTo(148.0f, 448.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(364.0f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _phonePortrait!!
    }

private var _phonePortrait: ImageVector? = null
