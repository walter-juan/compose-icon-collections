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

public val Simpleicons.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.358f)
                arcToRelative(0.854f, 0.854f, 0.0f, false, true, 1.235f, -0.767f)
                lineTo(6.134f, 7.05f)
                verticalLineToRelative(5.768f)
                curveToRelative(0.0f, 0.81f, 0.456f, 1.553f, 1.179f, 1.915f)
                lineToRelative(4.42f, 2.218f)
                verticalLineToRelative(1.692f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, -1.235f, 0.766f)
                lineTo(1.18f, 14.732f)
                arcTo(2.14f, 2.14f, 0.0f, false, true, 0.0f, 12.817f)
                close()
                moveTo(6.134f, 5.358f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, 1.235f, -0.766f)
                lineToRelative(4.898f, 2.458f)
                verticalLineToRelative(5.768f)
                curveToRelative(0.0f, 0.81f, 0.457f, 1.552f, 1.18f, 1.915f)
                lineToRelative(4.42f, 2.218f)
                verticalLineToRelative(1.692f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, -1.235f, 0.765f)
                lineToRelative(-4.899f, -2.457f)
                verticalLineToRelative(-5.769f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -1.179f, -1.914f)
                lineTo(6.134f, 7.05f)
                close()
                moveTo(12.267f, 5.358f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, 1.235f, -0.766f)
                lineToRelative(9.319f, 4.676f)
                arcTo(2.14f, 2.14f, 0.0f, false, true, 24.0f, 11.182f)
                verticalLineToRelative(7.46f)
                arcToRelative(0.853f, 0.853f, 0.0f, false, true, -1.235f, 0.766f)
                lineToRelative(-4.899f, -2.457f)
                verticalLineToRelative(-5.769f)
                arcToRelative(2.14f, 2.14f, 0.0f, false, false, -1.179f, -1.914f)
                lineToRelative(-4.42f, -2.218f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
